package javaSe.oop.polymorphic;

public class instanceOf {
    public static void main(String[] args) {
            BB bb = new BB();
            System.out.println(bb instanceof AA);
            System.out.println(bb instanceof BB);

            AA aa = new BB();
            System.out.println(aa instanceof AA);
            System.out.println(aa instanceof BB);
            System.out.println(bb instanceof Object);

            Object obj = new Object();
            System.out.println(obj instanceof AA);
    }
}
class AA{}
class BB extends AA {}
