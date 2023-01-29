package javaSe.oop.InnerClass;

public class Test {
    public static void main(String[] args) {
        AA aa = new AA();                  //第一种创建对象的方式
        AA.BB bb1 = aa.new BB();

        AA.BB bb2 = new AA().new BB();     //第二种创建对象的方式

        aa.age = 10;
        aa.setName("jack");
        aa.id = 123456;

        bb1.m();
        System.out.println("=========");
        bb2.m();

        System.out.println("=========");
        StaAA.StaBB bb3 = new StaAA.StaBB();
        aa.age = 10;
        aa.setName("jack");
        aa.id = 123456;
        bb3.m();



    }
}
