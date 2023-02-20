package com.eddy.IOStream.CharConversion;

import java.io.*;

/**
 * 字符转换流：
 *          1.先创建一个字节流
 *          2.再利用字节字符转换流，将字节流转换成字符流
 *          3.将字符流再变成字符缓冲流
 */
public class CharConversion {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        OutputStreamWriter out = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(out);
        bw.write("hello,java");
        bw.newLine();
        bw.write("hello,world");
        bw.flush();

        FileInputStream fis = new FileInputStream("a.txt");
        InputStreamReader reader = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
