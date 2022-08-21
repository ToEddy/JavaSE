package javaSe.oop.InnerClass;

public class scopeInnerclass {
    //int age;
    private String name;
    static int id;

    public void m(){
        final int age = 10;
        class CC{
            public void show(){
                System.out.println(age);
            }
        }
    }
}
