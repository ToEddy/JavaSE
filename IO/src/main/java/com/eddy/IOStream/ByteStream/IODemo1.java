package com.eddy.IOStream.ByteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo1 {
    public static void main(String[] args) throws IOException {
        //创建一个相对路径的文件
        File file = new File("a.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建一个字节流输出对象
        FileOutputStream fs = new FileOutputStream("a.txt");
        //写入一个ASCII码为97的字符
        fs.write(97);
        //1.写入字符数组
        byte[] bytes = {97,98,99};
        fs.write(bytes);
        //2.将字符串转换为字符数组
        byte[] bytes1 = "Java,你好!!".getBytes();
        fs.write(bytes1);
        //3.将字符串转换为字符数组
        byte[] bytes2 = "hello,java!!".getBytes();
        fs.write(bytes2,0,bytes.length);
        //4.设置字符数组的偏移量和长度
        byte[] bytes3 = {97,98,99,100,101};
        fs.write(bytes3,2,3);
        //关闭IO流
        fs.close();
    }
}
