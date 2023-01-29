package javaSe.oop.This;

public class User {
    String name = "rose";
    int age;
    public User(){
        this("jack");
        System.out.println("这是一个无参构造方法");
    }
    public User(String name){
        System.out.println("这个一个有参构造方法");
    }

    public User(String jack, int i) {

    }

    public void m1(){
        m2();
        String name = "jack";
        System.out.println(name);
        System.out.println(this.name);
    }
    public void m2(){
        System.out.println("方法m2");
    }
}
