package javaSe.oop.InterFace;

public class Users implements Comparable<Users> {
    private int age;
    private String name;

    public Users(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Users() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Users o) {
        return this.getAge()-o.getAge();
    }
}
