package javaSe.oop.constructor;

public class cons01 {
    int age = 10;
    String name = "jack";
    int age01;
    String name01;
    public cons01(){
        System.out.println("这是一个无参构造方法");
        System.out.println(age+"\t"+name);
        System.out.println(age01+"\t"+name01);
    }

    public cons01(String name){
        System.out.println("这是一个有参构造方法");
    }

    public void cons01(){
        System.out.println("这只是一个和类名相同的普通方法");
    }
}
