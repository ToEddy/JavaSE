package com.eddy.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(1);
        set.add(2);
        System.out.println(set);
        //1. 去重
        //2. 没有下标
        //3. 没有插入顺序
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
