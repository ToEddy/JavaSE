package javaSe.IOStream.File;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file1 = new File("d:\\a.txt");
        File file2 = new File("d:\\bb");
        File file3 = new File("d:","c");
        File file4 = new File(file2,"d");
        File file5 = new File("d:\\ee\\ff\\gg");
        File file6 = new File("kk");
        //创建一个文件
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建一个文件夹。mkdirs是可以创建两级目录
        file5.mkdirs();
        //mkdir只能创建一级目录，如果没有父目录，他是不能创建子目录的
        file2.mkdir();
        file4.mkdir();
        //判断文件夹或者文件是否存在
        System.out.println(file2.exists());
        //判断是否是文件
        System.out.println(file2.isFile());
        //判断是否是文件夹
        System.out.println(file2.isDirectory());

        //创建相对路径的文件或者文件夹
        try {
            file6.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //输出文件或者文件夹的绝对路径
        System.out.println(file6.getAbsoluteFile());//返回值是File
        System.out.println(file6.getAbsolutePath());//返回值是String
        //获取当前文件夹或者文件的名称
        System.out.println(file1.getName());
        //删除
        file6.delete();
    }
}
