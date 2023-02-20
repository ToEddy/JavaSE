package com.eddy.Collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    /**
     * LinkedHashSet 的特点:
     * 1、有序(和Set接口唯一的不一样)
     * 2、不可重复
     * 3、没有下标
     */
    public static void main(String[] args) {
        LinkedHashSet<String> se = new LinkedHashSet<>();
        se.add("jack");
        se.add("rose");
        se.add("tom");
        se.add("jerry");
        se.add("jack");
        System.out.println(se);

    }
}
