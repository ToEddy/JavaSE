package javaSe.Utility.Object;

public class Student extends Person{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }


    @Override    //重写了object类的toString方法，返回对象的属性信息，而不是地址
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
