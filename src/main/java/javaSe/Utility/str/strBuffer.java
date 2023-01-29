package javaSe.Utility.str;

public class strBuffer {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("abc");//相当于定义了一个"abc"字符串
        StringBuffer buf = new StringBuffer();   //相当于定义了一个空字符串
        //方法1.他是在原有的基础上进行追加，而不是创建一个新的字符串
        buf.append("abc");
        System.out.println(buf);

        //方法2. 在特定的位置插入字符串
        buf.insert(3,"de");
        System.out.println(buf);

        //方法3. 删除特定的字符串
        buf.delete(3,5);
        System.out.println(buf);

        //方法4. 翻转字符串
        buf.reverse();
        System.out.println(buf);

        //方法5. 将StringBuffer转化成String字符串类型
        String s = buf.toString();
        System.out.println(s);

        //创建一个一亿个a的字符串，StringBuffer是线程安全的
        StringBuffer buf2 = new StringBuffer();
        for (int i = 0; i <100000000 ; i++) {
            buf.append("a");
        }

    }
}
