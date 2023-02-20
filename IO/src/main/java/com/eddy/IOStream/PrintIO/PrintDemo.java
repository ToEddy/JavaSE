package com.eddy.IOStream.PrintIO;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 打印流：
 *          他只能是输出流！！！
 *          同一个文件不能同时使用字节流和字符流写入内容
 */
public class PrintDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("a.txt");
        ps.println("hello,java");
        ps.println(10);
        //写入对象的时候，其实写入的是对象的地址，应该调用toString方法
        ps.println(new Student(10,"jack",123).toString());
        ps.close();

        PrintWriter pw = new PrintWriter("b.txt");
        pw.println("hello,java_se");
        pw.close();
    }
}
