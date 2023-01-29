package javaSe.Utility.str;

import java.util.Arrays;

public class strMethod {
    public static void main(String[] args) {
        String str = "abcdecdfg";

        //方法1. charAt(index) 获取指定下标对应的字符，返回char类型
        System.out.println(str.charAt(3));

        //方法2. indexOf("字符串")  获取指定字符串在原字符串中的下标,如果不包含该字符串则返回-1
        System.out.println(str.indexOf("cd"));
        System.out.println(str.indexOf("dc"));

        //方法3. lastIndexOf("字符串") 与indexOf方法一致，返回指定子字符串在此字符串中最右边出现处的索引。
        System.out.println(str.lastIndexOf("cd"));

        //方法4. length()  获取字符串的长度
        System.out.println(str.length());

        //方法5. 判断两个字符串是否相等
        String str2 = "abcdecdfg";
        System.out.println(str2.equals(str));
        System.out.println(str2.equals("abcdecdfg"));
        System.out.println("abcdecdfg".equals(str));

        //方法6. 判断两个字符串是否相等，忽略大小写
        String str3 = "ABCdecdfg";
        System.out.println(str3.equalsIgnoreCase(str));

        //方法7. 判断字符串是否为空
        System.out.println(str.isEmpty());

        //方法8. 判断字符串是否以指定的字符开头
        System.out.println(str.startsWith("ab"));
        //并且规定其开始位置
        System.out.println(str.startsWith("cd",2));

        //方法9. 判断字符串是否以指定的字符结尾
        System.out.println(str.endsWith("ab"));

        //方法10. 判断字符串是否包含指定的字符
        System.out.println(str.contains("bc"));

        //方法11. 将字符串变成字节数组
        byte[] b = str.getBytes();
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        //方法12. 将字符串变成字符数组
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }

        //方法13. 字符串截取
        //注意：字符串是一个常量，是不能改变的，因此必须截取后要重新赋值
        String s1 = str.substring(2);
        String s2 = str.substring(2,5);
        System.out.println(s1);
        System.out.println(s2);
        //不赋值不改变
        System.out.println(str);

        //方法14. 将字符串中指定的内容进行替换
        String s3 = str.replace("ab","AB");
        System.out.println(s3);

        //方法15. 按照指定的字符串对原字符串进行切割
        String str4 = "abcdabcdabcdabcd";
        String[] ds = str4.split("d");
        for (int i = 0; i < ds.length; i++) {
            System.out.println(ds[i]);
        }

        //方法16. 将字符串变成大写
        String str5 = "abCDEfg";
        String s4 = str5.toUpperCase();
        System.out.println(s4);

        //方法17. 将字符串变成小写
        String s5 = str5.toLowerCase();
        System.out.println(s5);

        //方法18. 去掉字符串前后的空格
        String str6 = "  abCDEfg！！！  ";
        String trim = str6.trim();
        System.out.println(trim);

        //方法19. 将其他类型转换成string类型
        int i = 10;
        double d = 3.0;
        String s6 = i+"a";
        String s7 = d+"a";
        String s8 = String.valueOf(i);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
    }
}
