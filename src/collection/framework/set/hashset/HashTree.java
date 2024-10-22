package collection.framework.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashTree {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add(1000);
        hs.add(2000);
        hs.add(3000);
        hs.add(4000);
        hs.add(1); hs.add(2); hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7); hs.add(8);
        TreeSet t=new TreeSet<>(hs);
        System.out.println(hs);
        System.out.println(t);

        Iterator itr=t.iterator();
        while (itr.hasNext()){
            int i=(int)itr.next();
            if(i<7){
                System.out.println(i);
            }
        }

    }
}
