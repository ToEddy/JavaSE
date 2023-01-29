package javaSe.Collection.genericity;

public class UserBox <T>{
    private String Username;
    private int age;

    public UserBox(String username, int age) {
        Username = username;
        this.age = age;
    }

    public UserBox() {
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserBox{" +
                "Username='" + Username + '\'' +
                ", age=" + age +
                '}';
    }
}
