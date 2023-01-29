package javaSe.oop.polymorphic;

public class Test {
    public static void main(String[] args) {
//        Master master = new Master();
//
//        Dog dog = new Dog();
//        dog.Health = 40;
//        master.cure(dog);
//
//        Cat cat = new Cat();
//        cat.Health = 80;
//        master.cure(cat);

        Pet pet = new Dog();
        Dog dog = (Dog) pet;
        dog.swimming();

    }
}
