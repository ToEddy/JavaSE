package com.eddy.Utility.Math;

public class math {
    public static void main(String[] args) {
        double pow = Math.pow(2, 10);//指数计算
        System.out.println(pow);

        double sqrt = Math.sqrt(100);//开平方
        System.out.println(sqrt);

        double cbrt = Math.cbrt(1000); //开立方
        System.out.println(cbrt);

        System.out.println(Math.ceil(13.4)); //向上取整
        System.out.println(Math.floor(13.4));//向下取整
        System.out.println(Math.round(12.3));//四舍五入

        double random = Math.random(); //随机数[0,1)范围
        System.out.println(random);

        int i = (int)(Math.random()*10+10);//可以得到[10,100)的整数
        System.out.println(i);
    }
}
