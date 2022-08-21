package javaSe.IOStream.ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo3 {
    public static void main(String[] args) {
        FileOutputStream fil = null;
        try {
            //如果文件不存在的时候，就会帮助创建一个文件，但是要保证其父目录存在
            fil = new FileOutputStream("b.txt");
            fil.write("hello".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(fil != null){
                    fil.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
