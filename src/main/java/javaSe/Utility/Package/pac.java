package javaSe.Utility.Package;

public class pac {
    public static void main(String[] args) {
        int i = 10;
        Integer ii = Integer.valueOf(i);
        System.out.println(ii);

        Double dd = new Double(20);
        double d = dd.doubleValue();
        System.out.println(d);

    //自动拆装箱
        Integer ii2 = 10;
        System.out.println(ii2);
        double d2 = new Double(20);
        System.out.println(d2);

        Integer ii3 = 30;
        double s = ii3.doubleValue();
        System.out.println(s);
        byte s2 = ii3.byteValue();
        System.out.println(s2);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        int t = Integer.parseInt("12");
        System.out.println(t);
        double v = Double.parseDouble("13.4");
        System.out.println(v);
        double v2 = Double.valueOf("23.5");
        System.out.println(v2);




        /**
         * 面试题：整数型包装类缓冲区
         * 整数型的包装类定义缓冲区(-128~127)，如果定义的数在这个范围你之内，那么直接从缓存数组中获取，
         * 否则，重新new新的对象
         */
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println(i1 == i2); //false
        System.out.println(i1.equals(i2));//true

        Integer i3 = 1000; //Integer i3 = new  Integer(1000);
        Integer i4 = 1000; //Integer i3 = new  Integer(1000);
        System.out.println(i3 == i4); //false
        System.out.println(i3.equals(i4));//true

        Integer i5 = 100; //IntegerCache.cache[i + (-IntegerCache.low)]
        Integer i6 = 100; //IntegerCache.cache[i + (-IntegerCache.low)]
        System.out.println(i5 == i6);//true
        System.out.println(i5.equals(i6));//true


    }
}
