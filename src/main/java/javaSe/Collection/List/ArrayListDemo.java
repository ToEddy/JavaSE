package javaSe.Collection.List;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("jack");
        arr.add("rose");
        arr.add("tom");
        arr.add("jerry");
        System.out.println(arr);

        arr.add(2,"eddy");
        System.out.println(arr);

        arr.remove(3);
        System.out.println(arr);

        arr.set(2,"luna");
        System.out.println(arr);

        String s = arr.get(3);
        System.out.println(s);
    }
}
