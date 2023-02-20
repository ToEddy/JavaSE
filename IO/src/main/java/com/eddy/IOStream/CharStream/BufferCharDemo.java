package com.eddy.IOStream.CharStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 他的读取Read方法的特点：
 *                     有一个readLine方法可以每次读取一行
 *                     读到流的末尾会返回null
 * Write方法的特点：
 *                  有一个newLine方法可以支持换行
 *                  因此他可以每次写入一行
 */

public class BufferCharDemo {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("k.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello");
        bw.newLine();
        bw.write("java");
        bw.flush();   //字符缓冲流必须要刷新
        FileReader fr = new FileReader("k.txt");
        BufferedReader br = new BufferedReader(fr);
        //标配代码
        String str = null;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

        fr.close();
        br.close();
    }
}
