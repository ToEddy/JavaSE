package javaDemo;

import java.util.Date;

public class dateDemo {
    public static void main(String[] args) {
        Date time = new Date();
        Date time1= new Date(1996-1900,10-1,29);
        long time2 = time.getTime()-time1.getTime();
        System.out.println(time2/1000/60/60/24/365);
    }
}
