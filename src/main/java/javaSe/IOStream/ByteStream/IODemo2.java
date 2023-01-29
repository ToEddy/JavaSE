package javaSe.IOStream.ByteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class IODemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fil = new FileInputStream("a.txt");
        //方式1、一次只能读取一个字符，并返回这个字符的ASCII码,当读取到最后的字符之后，就会返回-1
        int read = fil.read();
        System.out.println(read);
        int read2 = fil.read();
        System.out.println(read2);
        int read3 = fil.read();
        System.out.println(read3);

        //方式2、指定一个缓冲数组，将读取的内容存放在数组中，read方法返回的是字符个数len，而不是ASCII码
        //然后通过String方法将字符数组转换成字符串
        byte[] buf = new byte[1024];
        int len = fil.read(buf);
        String str = new String(buf,0,len);
        System.out.println(str);

        //方式3、指定一个缓冲数组，当读取的内容大于缓冲数组的大小时，我们可以先读取1024个
        byte[] buf2 = new byte[1024];
        int len2;
        while ((len2 = fil.read(buf2)) != -1){
            String str2 = new String(buf2,0,len2);
            System.out.println(str2);
        }
    }
}
