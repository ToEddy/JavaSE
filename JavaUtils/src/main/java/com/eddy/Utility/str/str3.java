package com.eddy.Utility.str;

public class str3 {
    public static void main(String[] args) {

        //虽然abc是常量，但ABC并不是改变了s1的值，而是在常量池中创建了一个新的字符串ABC，让s1指向了ABC
//        String s1 = "abc";
//        s1 = "ABC";
//        System.out.println(s1);

        String s1 = "ab";
        String s2 = "c";
        String s3 = new String("abc");

        String str1 = "abc";
        String str2 = "abc";
        String str3 = "ab"+"c";
        String str4 = s1+s2;
        String str5 = new String("abc");
        String str6 = new String("ab")+"c";
        String str7 = s3.intern();
    //s1,s2和s3都是直接赋值的，他们都在常量池中，因此他们说互相相等的
        System.out.println(str1==str2);//T
        System.out.println(str1==str3);//T
    //str4是由两个字符串变量拼接来的，而变量的字符串拼接调用了StringBuilder类，因此他在堆中
        System.out.println(str1==str4);//F
    //凡是new创建的对象都在堆内存中
        System.out.println(str1==str5);//F
        System.out.println(str1==str6);//F
    //本来s3指向堆内存中对象，而intern方法会让s3指向常量池中的abc
        System.out.println(str1==str7);//T
    }
}
