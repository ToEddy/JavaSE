package com.eddy.Collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("china","中国");
        map.put("cn","中国");
        map.put("USA","美国");
        map.put("USA","漂亮国");
        map.put("kr","韩国棒子");

        //输出Map集合
        System.out.println(map);

        //根据key找到value
        System.out.println(map.get("USA"));

        //比较有没有key对应的value
        System.out.println(map.containsKey("cn"));

        //比较有没有value对应的key
        System.out.println(map.containsValue("美国"));

        //输出所有的key
        Set<String> str = map.keySet();
        System.out.println(str);

        //输出所有的value
        Collection<Object> val = map.values();
        System.out.println(val);

        //Map.Entry<String, Object>是Map集合的一个内部类，一个Entry就是表示一个键值对
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        System.out.println(entries);

        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
