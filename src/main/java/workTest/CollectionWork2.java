package workTest;

public class CollectionWork2 {
    /**
     * 学习中心在线编程胡杨
     * 学习中心/我的课堂/我的作业/开始作业
     * 集合相关选择题面试题目返回
     * 作业描述:
     * 1..对Collection和Collections描述正确的是 （）
     *
     * A Collection是java.util下的类，它包含有各种有关集合操作的静态方法
     *
     * B Collection是java.util下的接口，它是各种集合结构的父接口
     *
     * C Collections是java.util下的接口，它是各种集合结构的父接口
     *
     * D Collections是java.util下的类，它包含有各种有关集合操作的静态方法
     *
     * 2.关于Java中参数传递的说法，哪个是错误的？ （）
     *
     * A 在方法中，修改一个基础类型的参数不会影响原始参数值
     *
     * B 在方法中，改变一个对象参数的引用不会影响到原始引用
     *
     * C 在方法中，修改一个对象的属性会影响原始对象参数
     *
     * D 在方法中，修改集合和Maps的元素不会影响原始集合参数
     *
     * 3.下面哪些接口直接继承自Collection接口（）
     *
     * A List
     *
     * B Map
     *
     * C Set
     *
     * D Iterator
     *
     * 4.以下哪几个是java中的集合类型？（）
     *
     * A Vector
     *
     * B Set
     *
     * C String
     *
     * D List
     *
     * 5.下面Java中关于List、Set的说法哪些是正确的？（）
     *
     * A List是有序的，允许元素重复
     *
     * B Set是无序的，允许元素重复
     *
     * C List允许随机访问（下标访问）
     *
     * D Set不允许元素重复
     *
     * 6.在 Java 中，（ ）类可用于创建链表数据结构的对象。
     *
     * A LinkedList
     *
     * B ArrayList
     *
     * C Collection
     *
     * D HashMap
     *
     * 7.ArrayLists和LinkedList的区别，下述说法正确的有？多选题 （）
     *
     * A ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构。
     *
     * B 对于随机访问get和set，ArrayList觉得优于LinkedList，因为LinkedList要迭代器。
     *
     * C 对于新增和删除操作add和remove，LinkedList比较占优势，因为ArrayList要移动数据。
     *
     * D ArrayList的空间浪费主要体现在在list列表的结尾预留一定的容量空间，而LinkedList的空间花费 则体现在它的每一个元素都需要消耗相当的空间。
     *
     * 8. 欲构造ArrayList类得一个实例，此类继承了List接口，下列哪个方法是正确的：（）
     *
     * A ArrayList myList = new Object();
     *
     * B List myList = new ArrayList();
     *
     * C ArraylList myList = new List();
     *
     * D List myList = new List();
     *
     * 9.已知语句List list=new ArrayList();以下哪个方法是判断ArrayList中是否包含”qianfeng”？（）（选择一项）
     *
     * A list.contains("qianfeng");
     *
     * B list.add("qianfeng");
     *
     * C list.remove("qianfeng");
     *
     * D list.get("qianfeng");
     *
     * 10.以下语句正确的是：（）（选择两项）
     *
     * A List<String> list=new ArrayList<String>();
     *
     * B List<Integer> list=new ArrayList<>();
     *
     * C 已知Cat是Animal类的子类，则List<Animal> list=new ArrayList<Cat>();
     *
     * D List<Object> list=new ArrayList<Integer>();
     *
     * 11.以下关于Set对象的创建错误的是？（）（选择一项）
     *
     * A Set set=new Set();
     *
     * B Set set=new HashSet();
     *
     * C HashSet set=new HashSet();
     *
     * D Set set=new HashSet(10);
     *
     * 12.下列有关HashSet的描述正确的是（）（选择两项）
     *
     * A HashSet是Set的一个重要实现类
     *
     * B HashSet中的元素无序但可以重复
     *
     * C HashSet中只允许一个null元素
     *
     * D 不适用于存取和查找
     *
     * 13.HashMap的数据是以key-value的形式存储的，以下关于HashMap的说法正确的是？（）（选择一项）
     *
     * A HashMap中的键不能为null
     *
     * B HashMap中的Entry对象是有序排列的
     *
     * C key值不允许重复
     *
     * D value值不允许重复
     *
     * 14.下面有关java hashmap的说法错误的是？（）
     *
     * A HashMap 的实例有两个参数影响其性能：“初始容量” 和 “加载因子”。
     *
     * B HashMap 的实现不是同步的，意味着它不是线程安全的
     *
     * C HashMap通过开放地址法解决哈希冲突
     *
     * D HashMap中的key-value都是存储在Entry数组中的
     *
     * 15.在Java中，HashMap中是用哪些方法来解决哈希冲突的？（）
     *
     * A 开放地址法
     *
     * B 二次哈希法
     *
     * C 链地址法
     *
     * D 建立一个公共溢出区
     *
     * 16.在Java中，关于HashMap类的描述，以下错误的是（ ）？
     *
     * A HashMap能够保证其中元素的顺序
     *
     * B HashMap允许将null用作值
     *
     * C HashMap允许将null用作键
     *
     * D HashMap使用键/值得形式保存数据
     *
     * 17.已知HashMap对象，横线处应添加的语句是？（）（选择一项）
     *
     *
     *
     * A hashMap.get(key);
     *
     * B hasMap.getValue();
     *
     * C hashMap.getKey();
     *
     * D hashMap.Value();
     *
     * 18. 以下java程序代码，执行后的结果是（ ）
     *
     * java.util.HashMap map=new java.util.HashMap();
     *
     * map.put("name",null);
     *
     * map.put("name","Jack");
     *
     * System.out.println(map.size());
     *
     * A 0
     *
     * B null
     *
     * C 1
     *
     * D 2
     *
     * 19. HashMap和HashTable的描述，错误的是？（）
     *
     * A 他们都实现了Map接口。
     *
     * B HashMap非线程安全，在多个线程访问Hashtable时，不需要自己为它的方法实现同步，而 HashMap就必须为之提供额外同步。
     *
     * C HashMap允许将null作为一个entry的key或者value，而Hashtable不允许。
     *
     * D 通过contains方法可以判断一个对象是否存在于HashMap或者Hashtable中。
     *
     * 20.以下类型为Final类型的为（ ）
     *
     * A HashMap
     *
     * B StringBuffer
     *
     * C String
     *
     * D Hashtable
     *
     * 21.在Java中，关于HashMap类的描述，以下错误的是（ ）？
     *
     * A HashMap能够保证其中元素的顺序
     *
     * B HashMap允许将null用作值
     *
     * C HashMap允许将null用作键
     *
     * D HashMap使用键/值得形式保存数据
     *
     * 22.下面有关Java泛型的代码，编译报错的是（  ） （选择三项）
     *
     * A List<Object> list = new ArrayList<String>();
     *
     * B List<? extends Number> list = new ArrayList<Integer>();
     *
     * C List<String>[] array = new ArrayList<String>[0];
     *
     * D List<Number> list = new ArrayList<? extends Number>();
     *
     * 23..下列关于接口Comparable和Comparator的说法正确的是（）（选择两项）
     *
     * A 它们都是java的接口
     *
     * B 都是用来对自定义的类进行大小比较
     *
     * C Comparable接口在要比较的类的之外实现
     *
     * D Comparator在定义要比较的类的同时实现
     *
     * 24.下列说法中不正确的是：（）（选择一项）
     *
     * A Comparator接口用于对自定义类进行整体排序
     *
     * B Comparator接口可以将Comparator传递给sort方法
     *
     * C int compare（T o1，T o2）比较用来排序的两个对象
     *
     * D boolean equals（Object obj）指示对象obj是否是“等于”当前对象。此方法不可以被Object 类equals方法覆盖
     *
     * 25.要想保存具有映射关系的数据，可以使用以下哪些集合?(多选)( )
     *
     * A.ArrayList
     *
     * B.TreeMap
     *
     * C.HashMap
     *
     * D.TreeSet
     *
     * 26.使用Iterator时，判断是否存在下一个元素可以使用以下哪个方法？( )
     *
     * A.next()
     *
     * B.hash()
     *
     * C.hasPrevious()
     *
     * D.hasNext()
     *
     * 27.在程序开发中，经常会使用以下哪个类来存储程序中所需的配置？( )
     *
     * A.HashMap
     *
     * B.TreeSet
     *
     * C.Properties
     *
     * D.TreeMap
     *
     * 28.要想在集合中保存没有重复的元素并且按照一定的顺序排列，可以使用以下哪个集合？( )
     *
     * A.LinkedList
     *
     * B.ArrayList
     *
     * C.hashSet
     *
     * D.TreeSet
     *
     * 29.以下哪些方法是LinkedList集合中定义的？(多选)( )
     *
     * A.getLast( )
     *
     * B.getFirst( )
     *
     * C.remove(int index)
     *
     * D.next( )
     *
     * 30、ArrayList ist-new ArrayList(20);:中的Iist扩充几次( )
     *
     * A.0
     *
     * B.1
     *
     * C.2
     *
     * D.3
     *
     * 31.List、Set, Map哪个继承自Collection接口，- 下说法正确的是（）
     *
     * A. List Map
     *
     * B. Set Map
     *
     * C. List Set
     *
     * D. List Map Set
     *
     * 32.以下结构中，哪个具有同步功能（）
     *
     * A. HashMap
     *
     * B. ConcurrentHashMap
     *
     * C. WeakHashMap
     *
     * D. TreeMap
     *
     * 33.以下结构中，插入性能最高的是(  )
     *
     * A. ArrayList
     *
     * B. Linkedlist
     *
     * C. tor .
     *
     * D. Collection
     *
     * 34 以下结构中，哪个最适合当作stack使用(   )
     *
     * A. LinkedHashMap
     *
     * B. LinkedHashSet
     *
     * C. LinkedList
     *
     * 35.下列叙述中正确的是（）
     *
     * A.循环队列有队头和队尾两个指针，因此，循环队列是非线性结构
     *
     * B.在循环队列中，只需要队头指针就能反映队列中元素的动态变化情况
     *
     * C.在循环队列中，只需要队尾指针就能反映队列中元素的动态变化情况
     *
     * D.在循环队列中元素的个数是由队头指针和队尾指针共同决定的
     *
     * 36 ArrayList类的底层数据结构是(   )
     *
     * A.数组结构
     *
     * B、链表结构
     *
     * C、哈希表结构
     *
     * D.红黑树结构.
     *
     * 37.LinkedL ist类的特点是(   )
     *
     * A、查询快
     *
     * B、增删快
     *
     * C、元素不重复
     *
     * D.元索自然排序
     *
     * 38.Vector类的特点是(   )
     *
     * A、线程同步
     *
     * B、线程不同步
     *
     * C、增删快
     *
     * D、底层是链表结构
     *
     * 39.关于迭代器说法错误的是(  )
     *
     * A、迭代器是取出集台元素的方式
     *
     * B、迭代器的hasNext()万 法返回值是布尔类型
     *
     * C、List集合有特有迭代器
     *
     * D、next()方法将返回集合中的上一个元素.
     *
     * 40.实现下列哪个接口，可以启用比较功能(  )
     *
     * A、Runnable接口
     *
     * B、Iterator接口
     *
     * C、Serializable接口
     *
     * D、Comparator接口
     *
     * 41.给定下列代码:
     *
     * public void test() {
     *
     * try [
     *
     * oneMethod();
     *
     * System.out.printin(“condition 1" );
     *
     * } catch (ArrayIndexOutOfBoundsException e){
     *
     * System.out.printIn( "condition2" );
     *
     * }catch(Exception e)[
     *
     * System.out.println( "condition3" );
     *
     * }finally
     *
     * System.out.printIn( "finally" );
     *
     * }
     *
     * }
     *
     * oneMethod正常运行,将显示(  )
     *
     * A、condition 1和finally
     *
     * B、condition 2和condition1
     *
     * C、condition 3和finally
     *
     * D、全部显示.
     *
     * 42.下面代码运行的结果是(  )
     *
     * ArrayL _ist<String> al = newArrayList<String>0; .
     *
     * al.add(true); .
     *
     * al.add(123);
     *
     * al.add(“abc" );
     *
     * System.out.printIn(al;
     *
     * A、编译失败
     *
     * B、[true,123]
     *
     * C、[truc,123,abc];
     *
     * D、[abc];
     *
     * 43. ArrayList和Vector的区别说法正确的是(  )
     *
     * A. ArrayList是线程安全的。Vector是线程不安全
     *
     * B、ArrayList是线程不安全的，Vector 是线程安全的
     *
     * C、ArrayList底层是 数组结构，Vector底层 是链表结构
     *
     * D、ArrayList底层是链表结构， Vector底层是 数组结构
     *
     * 44.对于HashMap集合说法正确的是(  )
     *
     * A、底层是数组结构
     *
     * B、底层是链表结构
     *
     * C、可以存储null值和null键
     *
     * D、不可以存储null值利nul键
     *
     * 45．集合API 中Set接口的特点是哪项？（）
     *
     *     A．不允许重复元素，元素有顺序
     *
     *     B.允许重复元素，元素无顺序
     *
     *     C．允许重复元素，元素有顺序
     *
     *     D．不允许重复元素，元素无顺序
     *
     * 46．实现了Set接口的类是哪项？（）
     *
     *     A． ArrayList
     *
     *     B． HashTable
     *
     *     C． HashSet
     *
     *     D． Collection
     *
     * 47．表示键值对概念的接口是哪项？（）
     *
     *     A． Set
     *
     *     B． List
     *
     *     C． Collection
     *
     *     D． Map
     *
     * 48．List接口的特点是哪项？（）
     *
     *     A．不允许重复元素，元素无顺序
     *
     *     B．不允许重复元素，元素无顺序
     *
     *     C．允许重复元素，元素有顺序
     *
     *     D．允许重复元素，元素无顺序
     *
     * 49．下列哪些项是泛型的优点？ （）（选两项）
     *
     *     A．不用向下强制类型转换
     *
     *     B．代码容易编写
     *
     *     c．类型安全
     *
     *     D．运行速度快
     *
     * 50．创建一个只能存放String的泛型ArrayList的语句是哪项？（）
     *
     *     A. ArrayList<int> al=new ArrayList<int>()；
     *
     *     B. ArrayList<String> al=new ArrayList<String>()
     *
     *     C. ArrayList al=new ArrayList<String>()；
     *
     *     D. ArrayList<String> al =new List<String>()
     *
     *
     * 评分标准:
     * 每题2分，共50题，满分100分
     *
     * 作业附件:
     * 提交截止时间: 2022-09-07 00:00:00
     *
     * 批改记录:
     * 批改状态
     * 得分
     * 评语
     * 时间
     * 作业回答:
     * 请输入答案
     * 答题附件:	未选择任何文件
     * 最多可同时上传 5 个作业附件
     *
     * 附件格式支持：doc,docx,xls,xlsx,png,jpg,gif,ppt,pptx,pdf,txt,zip,rar,7z
     *
     * 取消 提交
     * ３４６９
     */
}
