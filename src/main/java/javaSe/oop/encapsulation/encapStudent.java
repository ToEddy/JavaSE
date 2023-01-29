package javaSe.oop.encapsulation;

/**
 * @author Eddy
 */
public class encapStudent {
    private int age;
    String name;
    private double salary;

    public int getAge() {
        return age;
    }

    public  void setAge(int age) {
        if(age>150||age<0)
        {
            this.age=18;

        }
        else {
            this.age = age;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
