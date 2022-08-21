package javaDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ipDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress tne = InetAddress.getLocalHost();
        System.out.println(tne.getHostName());
        System.out.println(tne.getHostAddress());

        InetAddress tne2 = InetAddress.getByName("www.baidu.com");
        System.out.println(tne2.getHostAddress());
        System.out.println(tne2.getHostName());

    }
}