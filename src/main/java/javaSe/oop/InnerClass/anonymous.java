package javaSe.oop.InnerClass;

public class anonymous {
    public static void m(){
         new demo(){    //父类的引用指向子类的对象(多态)
            int a;
            public void m2(){
                System.out.println("这是匿名内部类的方法1");
            }
        }.m2();

        demo d = new demo(){    //父类的引用指向子类的对象(多态)
            int a;
            public void m2(){
                System.out.println("这是匿名内部类的方法1");
            }
        };
        //d.m2();             无法调用子类独有的方法

        user users = new user(){
            @Override
            public void ff() {
                System.out.println("重写接口的抽象方法ff");
            }
        };
        users.ff();

        demo2 d2 = new demo2(){
            @Override
            void kk() {
                System.out.println("重写抽象类的抽象方法kk");
            }
        };
        d2.kk();
    }

    public static void main(String[] args) {
        m();
    }
}


class demo{
}

abstract class demo2{
    abstract void kk();
}

interface user{
    abstract void ff();
}
