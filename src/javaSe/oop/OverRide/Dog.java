package javaSe.oop.OverRide;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("子类重写的方法");
    }
}
