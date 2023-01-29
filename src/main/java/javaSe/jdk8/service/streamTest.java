package javaSe.jdk8.service;

import javaSe.jdk8.pojo.Person;
import org.junit.Test;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamTest {
    Stream<Person> personStream = Stream.of(
            /* collect(Collectors.maxBy(lambda表达式))   可以直接替换为max(lambda表达式) */
            new Person("赵丽颖", 58, 95),
            new Person("杨颖", 56, 88),
            new Person("迪丽热巴", 56, 99),
            new Person("柳岩", 52, 77)
    );
    @Test
    public void test01(){
        System.out.println(personStream.max(Comparator.comparingInt(Person::getAge)));
    }
    @Test
    public void test02(){
        //将personStream变成一个以年龄为key的map集合
        Map<Integer, List<Person>> map = personStream.collect(Collectors.groupingBy(person -> person.getAge()));
        System.out.println(map);
    }
    @Test
    public void test03(){
        //将数据进行分区,他是以TRUE、FALSE为key
        Map<Boolean, List<Person>> booleanListMap = personStream.collect(Collectors.partitioningBy(s -> s.getHeight() > 90));
        System.out.println(booleanListMap);
    }

    @Test
    public void test04(){
        /*joining 参数一：每一个元素中间都有的 参数二：前置拼接的元素 参数三：后置拼接的元素*/
        String s = personStream.map(Person::getName).collect(Collectors.joining("-","**","^^^"));
        System.out.println(s);
    }

}
