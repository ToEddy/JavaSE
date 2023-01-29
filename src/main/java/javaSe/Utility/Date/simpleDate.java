package javaSe.Utility.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDate {
    public static void main(String[] args) throws ParseException {

        //将当前Date日期格式转换成指定的SimpleDateFormat类型
        Date da = new Date();
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sim.format(da);
        System.out.println(format);

        //将给定是包含时间信息的字符串转化成Date日期格式
        String s = "2022-4-24";
        SimpleDateFormat sim2 = new SimpleDateFormat("yyyy-MM-dd");
        Date da2 = sim2.parse(s);
        System.out.println(da2);
    }
}
