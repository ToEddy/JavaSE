package javaSe.oop.InterFace;

public class Dog extends Animal implements Runnable,Swimming{
    @Override
    public void run() {
        System.out.println("重写Runnable接口的方法");
        System.out.println("跑");
    }
    @Override
    public void swim() {
        System.out.println("重写Swimming接口的方法");
        System.out.println("游泳");
    }
}
