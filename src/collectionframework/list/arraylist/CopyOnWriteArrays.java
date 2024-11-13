package collectionframework.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrays {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> c=new CopyOnWriteArrayList<>();
        c.add(105);
        c.add(1012);
        c.add(10124);
        c.add(10315);
        c.add(100);
        System.out.println(c);
        Iterator<Integer> itr=c.iterator();
        while(itr.hasNext()){
            Integer i=  itr.next();
            if(i.equals(100)||i.equals(105)){
                c.remove(i);
            }
            if (i.equals(10315)) {
                c.remove(i); // Throws ConcurrentModificationException
            }

        }
        System.out.println("Modified List after removal: " + c);


        List<String> list = new ArrayList<>(List.of("A", "B", "C"));
        List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C"));

        for (String item : list) {
            if (item.equals("B")) {
                list.remove(item); // Throws ConcurrentModificationException
            }
        }
        for (String item : list1) {
            if (item.equals("B")) {
                list.remove(item); // Throws ConcurrentModificationException
            }
        }
        ;

    }
}


