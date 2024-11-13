package collectionframework.set.hashset;
import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();

        h.add("B");
        h.add("C");
        h.add("C");

        h.add(null);

        h.add("Z");
        h.add("X");
        h.add(null);
        h.add("Y");
        h.add("A");
        LinkedHashSet<String> lh=new LinkedHashSet<String>(h);
        lh.add("M");
        lh.add("A");
        lh.add(null);
        lh.add(null);
        System.out.println(h.add("C"));
        System.out.println("hashSet "+h);
        System.out.println("LinkedHashSet "+lh);
        ArrayList al=new ArrayList();
        al.add("j");
        al.add("a");
        al.add("v");
        al.add("a");
        al.add("d");
        al.add("e");
        al.add("v");

//        al.add();
        System.out.println("ArrayList"+al);

    }
}
