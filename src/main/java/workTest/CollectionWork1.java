package workTest;

public class CollectionWork1 {
    /**
     * 1.a. 新建Account 类，在类中添加如下属性
     * long     id;         账户id
     * Double  balance;   账户金额
     * String   password;  账户密码
     * String   name      账户人
     * Date    ctime      开户时间
     * 提供get set 方法，重写toString方法，添加有参和无参构造方法。
     * b. 新建AccountAction类在main中初始化List集合并添加5条数据数据
     * c.在AccountAction类中定义有参数有返回值的getInfo方法，参数为List<Account>,返回值为List<Account>，
     * 将所有开户时间已经满3年的信息存入到集合当中并返回，然后在main方法中打印
     * d. 在AccountAction类中定义有参数无返回值的getPwd方法，参数为List<Account>，打印出账户密码以1结束的账户信息
     * e.在AccountAction类中定义有参数有返回值的getMoney方法，参数为List<Account>,
     * 返回所有张姓的账户平均金额，并在main方法中打印输入
     * f.在AccountAction类中定义有参数有返回值的getInfo方法，参数为List<Account>,返回类型为Account,返回账户金额最低的的账户信息
     *
     *
     * 2.a.新建Student封装类，在类中添加属性
     * Integer id    学生编号
     * String   name 学生名称
     * Integer  age    年龄
     * Integer  score   分数
     * String   classNum  班级号
     * Date   birthday   出生日期
     * 提供get set方法，重写toString添加有参和无参构造方法。
     * b. 新建StudentAction类，在main法中初始化List集合泛型Student并添加数据，classNum 表示学生的班号，例如“class05”
     * c. 在StudentAction类中新建无返回值studentAvgAge方法参数为List<Student>计算1907a班同学的平均年龄并输出并在main方法中调用，
     * 例如输出格式为：1907a学生的平均年龄：18岁
     * d. 在StudentAction类中新建无返回值classNumAvgScore方法参数为List<Student>计算所有成年学生的的平均分并在main方法中调用，
     * 例如输出格式为： 所有成年学生的平均分数是85分
     * e. 在StudentAction类中新建有返回值的getMinStu方法，方法的参数为List<Student>，返回类型为Student，
     * 返回集合当中年龄学校的学生信息，并在main方法中调用
     * f.在StudentAction类中新建无返回值的getCount方法，方法的参数为List<Student>,计算出1907A班年龄在20-25之间的不及格人数，
     * 并在main方法中调用
     */
}
