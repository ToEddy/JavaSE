package javaSe.oop.Extends;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        /**当创建子类对象时，不管使用子类的哪个构造器，
        默认情况下总会去调用父类的无参构造器，如果父类没有提供无参构造器，
        则必须在子类的构造器中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过*/
        dog.name = "小花";
        System.out.println(dog.name);
        dog.eat();      //继承了父类的eat方法
        dog.hobby="吃吃吃。。。";   //dog独有的属性
        System.out.println(dog.hobby);
    }
}
