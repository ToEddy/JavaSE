package javaSe.oop.static_keyWord;

public class StaFather {
    static int num1= 10;
    int num2 = 20;
    public static void aa(){
        System.out.println("这是一个静态方法");
        //bb();  报错
    }
    public void bb(){
        System.out.println("这是一个普通方法");
        aa();
    }
}
