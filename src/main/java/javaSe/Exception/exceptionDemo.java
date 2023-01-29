package javaSe.Exception;


public class exceptionDemo {
    public static void main(String[] args) {
        /**
         * 捕获异常：
         *          (主动处理异常)
         */
        //第一种方式：直接捕获最大的异常，那么后面的catch就不会执行,因为已经捕获了父类异常，子类异常就不需要捕获了。
        try {
            String s = null;
            System.out.println(s.length());
            String[] a = {"jack","rose"};
            System.out.println(a[4]);
        } catch (Exception e) {
            e.printStackTrace();//一定要把错误信息打印出来
        }

        //将异常分类来进行捕获，catch也要分类来进行，并且catch里面的异常不能和代码出现的异常不一样
        try {
            String s2 = null;
            System.out.println(s2.length());
            String[] a2 = {"jack","rose"};
            System.out.println(a2[4]);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
