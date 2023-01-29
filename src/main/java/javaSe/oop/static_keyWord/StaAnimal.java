package javaSe.oop.static_keyWord;

public class StaAnimal {
    {
        System.out.println("父类的代码块1");
    }
    {
        System.out.println("父类的代码块2");
    }
    static{
        System.out.println("父类的静态代码块");
    }
    public StaAnimal() {
        System.out.println("这是父类的构造方法");
    }
    public static void ff(){
        System.out.println("这是父类的静态方法ff");
    }
}
