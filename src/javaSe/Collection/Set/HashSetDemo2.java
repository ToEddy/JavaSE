package javaSe.Collection.Set;

import java.util.HashSet;
import java.util.Objects;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Person> ha = new HashSet<>();
        ha.add(new Person("jack",20));
        ha.add(new Person("rose",18));
        ha.add(new Person("tom",25));
        ha.add(new Person("jerry",19));
        ha.add(new Person("jack",20));
        //他们五个因为是new创建的,因此他们是不同的五个对象,他们的地址不一样
        System.out.println(new Person("jack", 20).hashCode());
        System.out.println(new Person("rose",18).hashCode());
        System.out.println(new Person("tom",25).hashCode());
        System.out.println(new Person("jerry",19).hashCode());
        System.out.println(new Person("jack",20).hashCode());
        //只有第一个和第五个Jack的hash值一样
        //因此只会比较一次equals方法
        //比较的结果就是两个Jack是一样的
        //这样就去掉了一个Jack
        /**
         * 所有的类中的hashCode方法都是继承自Object类,而Object类里面的hashCode方法只是针对于对象地址来进行返回值
         * 因此就算是对象所有的信息都一致,但是由于他们不是同一个对象,导致他们的hash值大概率是不相同的,因此不会对他们进行"去重"处理
         * 但是在业务开发中,我们一般会关注对象的属性信息来进行判断他们是不是同一个事物,并不需要关心他们是不是同一个对象
         * 这个时候我们就需要对继承自Object类的hashCode方法和equals方法来进行重写
         * 重写之后的hashCode方法对于对象的信息进行生成hash值,只要是不同的事物,无论对象是否相同,他们的hash值就大概率不一样
         * 而对象信息相同就会生产相同的hash值,但是可能会有hash冲突的产生,这个时候就会就会去比较equals方法
         */

        for (Person person : ha) {
            System.out.println(person);
        }
    }
}

class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals方法执行了!!!");
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
