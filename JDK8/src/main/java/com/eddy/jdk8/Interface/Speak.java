package com.eddy.jdk8.Interface;
@FunctionalInterface //被该注解修饰的接口只能有一个抽象方法
public interface Speak {
    void speak(String message);

}
