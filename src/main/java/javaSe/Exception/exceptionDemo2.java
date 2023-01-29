package javaSe.Exception;


public class exceptionDemo2 {
    public static void main(String[] args) {
        /**
         *  try{...}catch(){..}     一起使用
         *  try{...}catch(){..}catch(){..}  一起使用
         *  try{...}finally{....}    一起使用
         *  try{...}catch(){..}catch(){..}finally{....}  一起使用
         *  不能单独使用
         */
        try {
            String s = null;
            System.out.println(s.length());
            String[] a = {"jack","rose"};
            System.out.println(a[4]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("代码会执行吗1？");
        } finally { //无论代码是否有异常，都会执行finally
                    //一般finally用来写释放资源的代码
            System.out.println("代码会执行吗2？");
        }
        System.out.println("代码会执行吗3？");
    }
}
