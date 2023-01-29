package javaSe.oop.InnerClass;

public class AA {
    int age ;
    private String name;
    static int id ;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void dd(){
        System.out.println("这是外部类的普通方法");
    }

    public class BB{
        int age2 ;
        private String name2;
        public void m(){
            System.out.println(age);
            System.out.println(name);
            System.out.println(id);
            dd();
        }
    }
}
