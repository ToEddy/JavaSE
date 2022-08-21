package javaSe.oop.Final;

public class Son extends Father{
    final int a = 10;
    final int b;
    {
        b = 20;
    }
    final int c;
    public Son(){
        c= 30;
    }
    public Son(String name){
        c = 30;
    }
    //@Override   不能被子类重写
//    public final void aa(){
//        System.out.println("这是一个在子类中被final修饰的普通方法");
//    }
}
