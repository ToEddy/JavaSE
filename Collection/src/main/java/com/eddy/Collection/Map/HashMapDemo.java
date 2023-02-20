package com.eddy.Collection.Map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //他原来表示一个对象，里面可以赋值对象的基本属性
        HashMap<String,Object> map = new HashMap<>();
        map.put("Username", "jack");
        map.put("Password", "123456");
        map.put("age",10);

        Person p = new Person("jack","123456",20);

    }


    static class Person{
        private String Username;
        private String password;
        private int age;

        public Person(String username, String password, int age) {
            Username = username;
            this.password = password;
            this.age = age;
        }

        public Person() {
        }

        public String getUsername() {
            return Username;
        }

        public void setUsername(String username) {
            Username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
