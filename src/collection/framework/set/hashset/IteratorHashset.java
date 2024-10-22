package collection.framework.set.hashset;

import java.util.HashSet;

public class IteratorHashset implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        HashSet h=new HashSet();
        h.add(100);
        h.add(200);
        h.add(300);
        h.add(400);
        h.add(500);
        System.out.println(h.size());
        System.out.println(h);
        HashSet h1=(HashSet) h.clone();
        h1.add(1000);
        System.out.println(h1);
        System.out.println(h);
    }
}
