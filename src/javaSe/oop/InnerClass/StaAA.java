package javaSe.oop.InnerClass;

public class StaAA {
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
    public static void ff(){
        System.out.println("这是外部类的静态方法");
    }

    public static class StaBB {
        static int weight ;
        String name;
        public void m(){
            //System.out.println(age);
            System.out.println(id);
            //dd();
            ff();
        }
    }
}
