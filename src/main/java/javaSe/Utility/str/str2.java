package javaSe.Utility.str;

import java.util.Scanner;

public class str2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String s = sca.next();
        if("eddy"==s){
            System.out.println("用户名正确");
        }else{
            System.out.println("用户名不正确");
        }

        System.out.println("====================");
        if("eddy".equals(s)){
            System.out.println("用户名正确");
        }else{
            System.out.println("用户名不正确");
        }
    }
}
