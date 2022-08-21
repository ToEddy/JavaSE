package javaSe.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistDemo2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("jack");
        arr.add("rose");
        arr.add("tom");
        arr.add("jerry");

        //循环方法1. 迭代器
        Iterator<String> it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //方法2. for循环
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        //方法3. 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
