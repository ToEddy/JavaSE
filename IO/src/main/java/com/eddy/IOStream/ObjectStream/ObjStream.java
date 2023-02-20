package com.eddy.IOStream.ObjectStream;

import java.io.*;

/**
 * 对象流：
 *      1.NotSerializableException  没有序列化异常
 *      处理：只需要让类Student实现Serializable接口就可以正常的进行序列化
 *      序列化：将对象转化成序列放在对应的文件夹中储存
 *      反序列化：将序列的数据转换成对象
 *      2.对象流读取到末尾会抛出异常EOFException
 *      3.对象流提供了读取基本数据类型的方法，包括String
 *            其关键就是将基本数据类型转换成包装类
 *
 *      transient 关键字：让对象属性不被序列化
 *
 *
 */
public class ObjStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos  = new FileOutputStream("o.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student stu = new Student(20,"jack");
        oos.writeObject(stu);
        oos.writeInt(1);//对象流提供了读取基本数据类型的方法
        oos.close();


        FileInputStream fis = new FileInputStream("o.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        Object o2 = ois.readInt();//对象流提供了读取基本数据类型的方法
        System.out.println(o);
        System.out.println(o2);
    }
}
