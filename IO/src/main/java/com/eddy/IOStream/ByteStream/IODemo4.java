package com.eddy.IOStream.ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IODemo4 {
    public static void main(String[] args) {
        copy("C:\\Users\\Eddy\\Downloads\\Chorme下载\\CrystalDiskMark _7QuB.exe","d:");
    }

    public static  void copy(String file1,String file2){
        FileOutputStream fo = null;
        FileInputStream fi = null;
        try {
            fi = new FileInputStream(file1);
            fo = new FileOutputStream(file2);

            byte[] bytes = new byte[1024];
            int len;
            while ((len = fi.read(bytes))!=-1){
                fo.write(bytes,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(fi!=null)
                    fi.close();
                if(fo!=null)
                    fo.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
