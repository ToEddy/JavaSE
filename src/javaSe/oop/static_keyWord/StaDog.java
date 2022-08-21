package javaSe.oop.static_keyWord;

public class StaDog extends StaAnimal{
    {
        System.out.println("子类的代码块1");
    }
    {
        System.out.println("子类的代码块2");
    }
    static{
        System.out.println("子类的静态代码块");
    }
    public StaDog() {
        System.out.println("这是子类的构造方法");
    }

    public static void ff(){
        System.out.println("这是子类的静态方法ff");
    }
}
