package javaSe.Utility.System;

import java.text.SimpleDateFormat;

public class sys {
    public static void main(String[] args) {

        //获取系统当前时间，得到一个时间戳
        long time = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());

        //将time这个时间戳利用format方法转化成指定的SimpleDateFormat类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(time);
        System.out.println(format);

        //退出java虚拟机
        System.exit(0);
    }
}
