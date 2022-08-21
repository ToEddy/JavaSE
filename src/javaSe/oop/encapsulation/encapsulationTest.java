package javaSe.oop.encapsulation;

/**
 * @author Eddy
 */
public class encapsulationTest {
    public static void main(String[] args) {
        encapStudent User= new encapStudent();

        User.setAge(300);
        User.setSalary(4000);

        System.out.println(User.getAge());
        System.out.println(User.getSalary());
    }
}
