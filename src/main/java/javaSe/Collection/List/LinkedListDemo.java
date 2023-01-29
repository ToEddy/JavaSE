package javaSe.Collection.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        //他和ArrayList一样，具有链表结构的操作
        li.add("jack");
        li.add("rose");
        System.out.println(li);
        li.addFirst("tom");//向链表头部插入数据
        li.addLast("jerry");
        System.out.println(li);

        Iterator<String> iterator = li.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //LinkedList同时也具备队列相关的数据结构的操作
        li.offer("eddy");//向队尾添加元素
        System.out.println(li);
        System.out.println(li.peek());//获取队头元素但不删除
        System.out.println(li.poll());//获取队头元素并且删除
        System.out.println(li);

        //堆栈相关的操作
        li.push("asta");//压栈
        System.out.println(li);
        System.out.println(li.remove());//获取并移除第一个元素
        System.out.println(li);
        System.out.println(li.remove(2));//获取并移除特点位置的元素
        System.out.println(li);
        System.out.println(li.pop());//弹栈
        System.out.println(li);
    }
}
