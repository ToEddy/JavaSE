package javaSe.Collection.coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("jack");
        coll.add("rose");
        coll.add("tom");
        coll.add("jerry");
        Iterator it = coll.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
