package javaSe.oop.Super;

public class Dog extends Animal {
    int age = 10;
    public void test() {
        super.eat();
        System.out.println(super.age);
        System.out.println(this.age);
        System.out.println(age);
    }
    public  Dog() {
        super("jack");
    }
}
