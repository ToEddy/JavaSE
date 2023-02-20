package com.eddy.Utility.Math;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(100);
        System.out.println(i);

        System.out.println(random());//输出调用下面的random方法
        System.out.println(random2());
    }

    public static String random(){
        StringBuffer bu = new StringBuffer();
        String s = "0123456789";
        Random ra = new Random();
        for (int i = 0; i < 4; i++) {
            int index = ra.nextInt(s.length()); //随机产生一个[0,s.length())长度的下标数
            bu.append(s.charAt(index)); //调用字符串的charAt方法取出该下标数对应的字符,
                                        //再通过StringBuffer的append方法，将其赋值给bu
        }
        return bu.toString(); //bu是StringBuffer类型的对象，必须通过toString方法将其变成String类型才能返回
    }

    public static String random2(){
        StringBuffer bu2 = new StringBuffer();
        String s2 = "0123456789";
        char[] ch = s2.toCharArray();//将字符串变成字符数组
        Random ra2 = new Random();
        for (int i = 0; i < 4; i++) {
            int index2 = ra2.nextInt(s2.length()); //随机产生一个[0,s.length())长度的下标数
            bu2.append(ch[index2]);
        }
        return bu2.toString();
    }
}
