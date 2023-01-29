package javaSe.IOStream.ByteStream;

import java.io.*;

/**
 * 缓冲流：
 *      特点：
 *         他必须依托于简单的流才能创建
 *         输出缓冲流如果想写入数据，那么就必须调用flush方法来进行刷新，或者关闭流也会启动刷新机制
 *         输入缓冲流读取数据就不需要刷新操作
 *     作用：
 *          提高了效率
 */
public class BufferStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("hello".getBytes());
        bos.flush();
        bos.close();//close方法调用了flush方法

        FileInputStream fis = new FileInputStream("a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            String s = new String(bytes, 0, len);
            System.out.println(s);
        }
        bis.close();
    }
}
