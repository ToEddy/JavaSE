package javaSe.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class exceptionDemo3 {
    public static void main(String[] args) throws ParseException {
        /**
         * 抛出异常：
         *          (消极处理异常)
         *          框架里面把异常抛出，调用者会在调用方法的时候，必须处理异常
         *          这个时候调用者就可以自定义异常的处理方式以及添加有关的操作
         */
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        sim.parse("2022-4-29");
        try {
            user("admin",12345);
            System.out.println("登陆成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("用户名或者密码错误，返回到登录页面");
        }
    }

    public static void user(String username,int password) throws Exception {
        if(!username.equals("admin")||!(password==123456)){
            throw new usernameAndPasswordException("用户名或者密码错误");
        }
    }
}
