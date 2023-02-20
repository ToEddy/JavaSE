package com.eddy.Collection.genericity;

public class genericDemo {
    public static void main(String[] args) {
        /**
         * 泛型：
         *     T ：表示未知的类型，当使用者需要使用什么类型的时候，
         *     在创建对象的时候再赋予其特定的类型，这样就能调用特定类型的一些方法。比如String类型的length方法
         *     如果在定义UserBox类的时候就将其定义为Object类型，那么到时候就无法调用一些子类的特定方法
         *     因为父类无法调用子类的独有方法
         */
        UserBox<String> user = new UserBox<>();
        user.setUsername("jack");
        System.out.println(user.getUsername().length());
    }
}
