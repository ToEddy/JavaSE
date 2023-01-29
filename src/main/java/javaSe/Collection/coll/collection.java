package javaSe.Collection.coll;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main(String[] args) {
        Collection coll = new ArrayList();

        coll.add("jack");
        coll.add(10);
        coll.add(20.4);
        coll.add(true);
        System.out.println(coll);

        System.out.println(coll.contains("jack"));

        System.out.println(coll.isEmpty());

        coll.remove(10);
        System.out.println(coll);

        int i = coll.size();
        System.out.println(i);
        System.out.println(coll.size());  //方法2

        Collection coll2 = new ArrayList();
        coll2.add("rose");
        coll2.add(999);

        coll.addAll(coll2);
        System.out.println(coll);

        coll.removeAll(coll2);
        System.out.println(coll);

        coll.clear();
        System.out.println(coll);
    }
}
