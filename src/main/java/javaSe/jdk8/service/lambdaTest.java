package javaSe.jdk8.service;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lambdaTest {
    @Test
    public void test01(){
        //如何消费这个数据？？  我们将这个数据转换大小写
        changeOne(s ->System.out.println(s.toUpperCase()));
        changeTwo(s ->System.out.println(s.toUpperCase()), s -> System.out.println(s.toLowerCase()));
        changeTwo2(s ->System.out.println(s.toUpperCase()), s -> System.out.println(s.toLowerCase()));
    }
    public static void changeOne(Consumer<String> consumer){
        consumer.accept("hello");
    }
    public static void changeTwo(Consumer<String> consumer1,Consumer<String> consumer2){
        String s = "Hello World";
        consumer1.accept(s);
        consumer2.accept(s);
    }
    public static void changeTwo2(Consumer<String> consumer1,Consumer<String> consumer2){
        String s = "Hello World";
        consumer1.andThen(consumer2).accept(s);
    }

    @Test
    public void test02(){
        /**
         * Supplier接口能够通过get方法生成一个Integer类型的数据 number => arr[arr.length-1]
         * 而我们需要做的就是重写get方法，让它能够按照我们的意愿得到需要的数据
         */
        getMax(() -> {
            int[] arr = {11,22,33,44,55};
            Arrays.sort(arr);
            return arr[arr.length-1];
        });
    }
    public static void getMax(Supplier<Integer> sup){
        // Supplier接口的作用就是通过get方法
        Integer number = sup.get();
        System.out.println("number = " + number);
    }

    @Test
    public void test03(){
        functionChange(s -> Integer.parseInt(s));
    }

    public static void functionChange(Function<String,Integer> function ){
        Integer apply = function.apply("123");
        System.out.println(apply);
    }

    @Test
    public void test04(){
        predicate(s -> s.equals("abc"), "abc");
    }

    public static void predicate(Predicate<String> pre,String str){
        boolean test = pre.test(str);
        System.out.println(test);
    }
}
