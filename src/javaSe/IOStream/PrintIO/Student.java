package javaSe.IOStream.PrintIO;

public class Student {
    int age;
    String name;
    int ID;

    public Student(int age, String name,int ID) {
        this.age = age;
        this.name = name;
        this.ID = ID;
    }
    public Student(){};

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
