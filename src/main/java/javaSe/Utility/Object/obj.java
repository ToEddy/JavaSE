package javaSe.Utility.Object;

public class obj {
    public static void main(String[] args) {
        Person stu = new Student();
    //方法1. 获取对象的真实类型
        System.out.println(stu.getClass());
    //对比两个对象的类型是否相等
        Person stu2 = new Teacher();
        System.out.println(stu.getClass()==stu2.getClass());
    //方法2. 返回对象的属性，而不是地址
        Person stu3 = new Student("jack",20);
        System.out.println(stu3.toString());
    //方法3. hashCode用来表示对象的地址的唯一标识，但是有可能会有hash冲突
        Person stu4 = new Student("rose",18);

        System.out.println(stu3.hashCode());
        System.out.println(stu4.hashCode());
    //方法4. equals用来比较对象是否相等的最强方法，因为他是用来比较地址的

        Person th1 = new Teacher("jack",20);
        Person th2 = new Teacher("jack",20);
        System.out.println(th1.equals(th2));
    }
}
