package collection.framework.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class AddTreeSet {
    public static void main(String[] args) {
        TreeSet t=new TreeSet<>();
        t.add("Green");
        t.add("Orange");
        t.add("White");
        t.add("Black");
        t.add("Purple");
        t.add("Brown");
        System.out.println(t);
        Iterator itr=t.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println( "First Element"+t.first());
        System.out.println("Last element"+t.last());
    }
}
