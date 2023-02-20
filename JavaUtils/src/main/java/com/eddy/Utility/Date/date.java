package com.eddy.Utility.Date;

import java.util.Date;

public class date {
    public static void main(String[] args) {
        //获取当前时间
        Date da = new Date();
        System.out.println(da.toString());

        //获取特定时间，并且他是从1900年开始的，月份是从0~11
        Date da2 = new Date(2022-1900,4-1,23);
        System.out.println(da2);

        //他是从1970年开始计算的  获取的是当前时间的时间戳，可以作为文件标识
        Date da3 = new Date();
        long time = da3.getTime();
        System.out.println(time);





    }
}
