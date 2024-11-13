package collectionframework.set;

import java.util.TreeSet;

public class TreeSetMethods {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(10);
        ts.add(100);
        ts.add(120);
        ts.add(103);
        ts.add(120);
        ts.add(110);
        ts.add(40);
        ts.add(80);
        System.out.println(ts);
        System.out.println(ts.last());
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println("SubSet=> "+ts.headSet(100));
        System.out.println("SubSet=> "+ts.tailSet(100));
        System.out.println(ts);
    }
}
