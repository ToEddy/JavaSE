package javaSe.oop.Extends;

public class Animal {
    private int age;
    String name;
    public void eat(){
        System.out.println("吃薯片");
    }
    public int getAge() {   //通过公共访问方法来访问private age；

        return age;
    }
    //    public Animal(){
//        System.out.println("无参构造方法");
//    }
    public Animal(String name){
        System.out.println("有参构造方法");
    }
}





