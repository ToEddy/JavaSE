package com.eddy.Utility.BigDecimal;

import java.math.BigDecimal;

public class BigD {
    public static void main(String[] args) {
        double d1 = 1;
        double d2 = 0.9;
        double s = d1-d2;
        System.out.println(s);

        //引出这个类
        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("0.9");

        BigDecimal subtract = b1.subtract(b2);
        System.out.println(subtract);

        BigDecimal add = b1.add(b2);
        System.out.println(add);

        BigDecimal multiply = b1.multiply(b2);
        System.out.println(multiply);

        BigDecimal divide = b1.divide(b2,4,BigDecimal.ROUND_CEILING);
        System.out.println(divide);
    }
}
