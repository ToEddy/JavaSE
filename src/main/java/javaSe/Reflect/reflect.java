package javaSe.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 类对象：
 *      1、永远都只有一个，但是类的对象可以有无数个
 *      2、类对象包含了类的所有信息：属性、方法、构造方法、父类、接口等
 *      3、类对象的类型是Class
 *
 *获取一个类的类对象的三种方式：
 *       1、通过对象的getClass方法
 *          用的比较少，一般是类的对象需要使用类对象的时候才会获取
 *      2、通过 类名.class
 *          一般用于方法的参数
 *      3、通过Class.forName("包名+类名")
 *          使用最多，
 */

public class reflect {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();
        test08();
        test09();
        test10();
    }

    public static void test01(){
        User user = new User();
        Class<? extends User> c = user.getClass();
        System.out.println(c);
    }
    public static void test02(){
        Class<User> c = User.class;
        System.out.println(c);
    }
    public static void test03() throws ClassNotFoundException {
        Class<?> c = Class.forName("javaSe.Reflect.User");
        System.out.println(c);
    }
    public static void test04() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("javaSe.Reflect.User");
        //方法1、获取类名
        System.out.println(c.getSimpleName());
        //方法2、获取类的全限定名
        System.out.println(c.getName());
        //方法3、获取父类的类对象,当他没有直接父类的时候，那么就是object
        System.out.println(c.getSuperclass());
        //方法4、获取接口，返回的是一个数组，因为一个类可以实现多个接口
        //Arrays.toString()  将数组的内存地址变成一个字符串
        System.out.println(Arrays.toString(c.getInterfaces()));
        //通过类对象创建类的对象,他所使用的就是类的无参构造
        //有一个InstantiationException 实例化异常
        /*Object o = c.newInstance();
        我们还可以将他强转
         */
        User o = (User) c.newInstance();
        System.out.println(o);
        System.out.println("-------------------------------");
    }
    public static void test05() throws NoSuchFieldException {
        Class<User> c = User.class;
        //获取类对象和父类的所有的属性(公开的)
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-------------------------------");
        //获取指定的公开的属性，且必须是公开的
        Field password = c.getField("password");
        System.out.println(password);
        System.out.println("-------------------------------");
        //获取所有的公开和私有的属性，但不包括父类
        Field[] declaredFields = c.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("-------------------------------");
        //获取指定的公开的和自身私有的属性,父类的不行
        Field name = c.getDeclaredField("name");
        System.out.println(name);
        System.out.println("-------------------------------");
    }

    public static void test06() throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<User> c = User.class;
        //获取user里面的指定的属性
        Field id = c.getField("id");
        //创建一个user对象
        User user = c.newInstance();
        //往指定的对象user的属性id里面存值1
        id.set(user,"1");
        //取值
        System.out.println(id.get(user));
    }

    public static void test07() throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        //如何访问私有属性？
        //通过修改私有属性的访问权限去暴力反射
        Class<User> c = User.class;
        Field name = c.getDeclaredField("name");
        User user = c.newInstance();
        //修改访问权限,如果不修改，就会报 IllegalAccessException 非法访问异常
        name.setAccessible(true);
        name.set(user,"jack");
        System.out.println(name.get(user));
    }

    public static void test08() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        //获取所有的公开方法，包括父类的公开的方法
        Class<?> c = Class.forName("javaSe.Reflect.User");
        Object o = c.newInstance();
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("--------------------------------------");
        //获取指定的方法，公开的和父类的
        Method aa = c.getMethod("aa");
        Method dd = c.getMethod("dd",String.class);
        //当方法有参数的时候，必须加上参数的类型，注意因为调用的类的方法可能会有重载，加上参数类型可以区分
        Method bb = c.getMethod("bb", String.class, int.class);
        System.out.println(bb);
        System.out.println(dd);
        System.out.println("--------------------------------------");
        //获取所有的方法，包括公开的和私有的,父类的公开的
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("--------------------------------------");
        //获取指定的方法，包括公开的和私有的，父类的公开的
        Method kk = c.getDeclaredMethod("kk",int.class);
        Method dd1 = c.getDeclaredMethod("dd",String.class);
        System.out.println(kk);
        System.out.println(dd1);
    }
    public static void test09() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> c = Class.forName("javaSe.Reflect.User");
        User user = (User) c.newInstance();
        //已经获取到自身的私有方法了，不需要通过暴力反射
        Method kk = c.getDeclaredMethod("kk", int.class);
        //暴力反射只是调用的时候需要，获取不需要，暴力反射是不能获取和调用父类的私有方法
        kk.setAccessible(true);
        //invoke方法的返回值就是调用方法的返回值，他自身没有返回值
        //如果方法没有返回值，那么invoke就返回null
        Object invoke = kk.invoke(user, 3);
        System.out.println(invoke);
        System.out.println("----------------------------------");
    }
    public static void test10() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> c = Class.forName("javaSe.Reflect.User");
        //获取所有的构造方法,公开的，但不包括父类的所有构造方法
        Constructor<?>[] constructors = c.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        //获取指定的构造方法，公开的，不包括父类的
        Constructor<?> constructor = c.getConstructor(int.class);
        System.out.println(constructor);
        System.out.println("------------------------------------");
        //获取公开的和私有的构造方法，不包括父类
        Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("------------------------------------");
        //获取指定的构造方法，公开的和私有的，不包括父类
        Constructor<?> declaredConstructor = c.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);
        /*
        当这个类没有无参构造方法的时候，我们一般才用获取的构造方法去创建对象，
        如果有无参构造，我们可以直接通过类对象的newInstance去创建对象
         */
    }

}
