package collectionframework.treeset;

import java.util.ArrayDeque;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSets {

    public static void main(String[] args) {
        TreeSet t=new TreeSet();

        TreeMap t1=new TreeMap();
        t1.put(0,0);
        t1.put(1,9);
        t.add(0);
        t.add(100);
        t.add(1);
        t.add(50);
        t.add(20);
        t.add(1000);
        System.out.println(t1);
    
        System.out.println(t);
    }
}
