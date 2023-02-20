package com.eddy.Utility.str;

public class str {
    public static void main(String[] args) {
        String s = "jack";                           //方式一

        String t = new String("rose");      //方式二

        byte[] a = {97,98,99,0,0,0};
        String s2 = new String(a,0,3);  //方式三
        System.out.println(s2);

        char[] a2 = {97,98,99,0,0,0};
        String s3 = new String(a,0,3);   //方式四
        System.out.println(s3);
    }
}
