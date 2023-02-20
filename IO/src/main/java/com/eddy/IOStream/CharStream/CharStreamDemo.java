package com.eddy.IOStream.CharStream;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 字符流：
 *      字符输出流：FileWriter
 *              他的底层实现原理是字节缓冲流，因此写入完成后要刷新
 *      字符输入流：FileReader
 *              read方法返回的是Unicode码表的整数值
 *              读取到文件的末尾也会返回-1
 */
public class CharStreamDemo {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("e.txt",true);
        //写入方式1.
        fw.write(97);
        //写入方式2.
        fw.write("你好，Java");
        //写入方式3.
        fw.write("你好，世界".toCharArray());
        fw.flush();

        FileReader fr = new FileReader("e.txt");
        int i = fr.read();
        //char read = (char)fr.read();
        System.out.println(i);
        char[] ch = new char[1024];
        int len;
        while ((len = fr.read(ch)) != -1) {
            String s = new String(ch,0,len);
            System.out.println(s);
        }
    }
}
