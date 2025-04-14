package Buoi11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("hello");
        list1.add("java");
        list1.add("collection");

        System.out.println("1. Using iterator");
        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("2. Using for");
        for (String s : list1) {
            System.out.println(s);
        }
        System.out.println("3. Using for with index");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
