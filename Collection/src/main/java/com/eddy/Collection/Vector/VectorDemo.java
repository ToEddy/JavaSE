package com.eddy.Collection.Vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> ve = new Vector<>();
        ve.add("jack");
        ve.add("rose");
        //他与ArrayList相同,底层实现原理都是数组
        //区别:
        //     ArrayList是当添加元素的时候，才会扩容数组，默认长度为10
        //	   Vector是当创建对象的是，就创建长度为10的数组
        //     ArrayList线程不安全，效率高
        //     Vector是线程安全的，效率低
    }
}
