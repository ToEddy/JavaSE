package javaSe.Reflect;

public class User extends Person{
    private String name;
    public String id;
    public void aa(){
        System.out.println("公开的方法");
    }
    public void bb(String name,int id){
        System.out.println("公开的有参的方法");
    }
    private int kk(int a){
        System.out.println("私有的方法");
        return 6;
    }
    private User(String name) {}
    public User(int id){}
    public User(){}
}

class Person{
    private String card;
    public String password;
    public void dd(String name){
        System.out.println("父类的公开的方法");
    }
    private int ee(int b){
        System.out.println("父类的私有的方法");
        return 7;
    }
    public Person(String password){}
    public Person(){}
}
