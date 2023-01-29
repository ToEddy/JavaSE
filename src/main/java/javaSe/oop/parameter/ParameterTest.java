package javaSe.oop.parameter;

/**
 * @author Eddy
 */

public class ParameterTest {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println("传递之前的值为"+arr[0]);
        parameter01(arr);
        System.out.println("传递之后的值为："+arr[0]);

        int i=1;
        System.out.println("传递之前的值为"+i);
        parameter02(i);
        System.out.println("传递之后的值为："+i);

        String name = "rose";
        System.out.println("传递之前的值为"+name);
        parameter03(name);
        System.out.println("传递之后的值为："+name);

    }


    public  static  void parameter01(int arr []){
        arr [0] = 100;
    }

    public  static  void parameter02(int i){
        i=100;
    }

    public  static  void parameter03(String name){
        name="jack";
    }
}
