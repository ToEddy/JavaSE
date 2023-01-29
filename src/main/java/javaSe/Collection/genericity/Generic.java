package javaSe.Collection.genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Generic {
    public static void main(String[] args) {

        /**
         *      集合Collection储存的对象类型由Object类型强制成了Student类型(避免了向上转型)
         *      然后在调用集合元素的时候，由于元素都是Object类型，如果想调用Student的方法，就必须向下转型，
         *      此时极有可能发生类型转换异常
         */
        Collection coll = new ArrayList();
        coll.add(new Student(18,"jack"));
        coll.add(new Student(15,"rose"));
        coll.add(new Person(20,"tom"));

        Iterator it = coll.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            Student stu = (Student) obj;
            stu.play();
        }
        /**
         * 泛型：
         *      将类型转换的问题提前到了编译期，省略了强制类型转换
         *      规定了必须输出元素的类型
         */

        Collection<Student> coll2 = new ArrayList<>();
        coll.add(new Student(18,"jack"));
        coll.add(new Student(15,"rose"));
        coll.add(new Student(20,"tom"));

        Iterator<Student> it2 = coll.iterator();
        while(it.hasNext()) {
            Student stu2 = it2.next();
            stu2.play();
        }

        /**
         * 泛型还支持多态,但是定义的时候不存在多态，并且他还不支持基本数据类型，只能使用他们的包装类
         *              当泛型定义为输入类型的父类时，就可以将他的子类的对象储存在集合中
         *              此时发生了向上转型
         *              但是这样到了要调用子类对象的方法的时候，还是要向下转型
         *              这样做完全没有必要！！！
         */
    }
}
