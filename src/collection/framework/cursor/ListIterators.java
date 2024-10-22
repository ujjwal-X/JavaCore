package collection.framework.cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterators {
    public static void main(String[] args) {
        LinkedList<String> l= new LinkedList<>();
//        Collection c=new LinkedList();
        l.add("C");
        l.add("C++");
        l.add("Java");
        l.add("JavaScript");
        l.add("Sql");
        System.out.println(l);
        ListIterator li=l.listIterator();
        while (li.hasNext()){
            String s= (String) li.next();
            if(s.equals("Sql")){
                li.remove();//remove
            } else if (s.equals("C++")) {
                li.add("ROR");//addition
            } else if (s.equals("C")) {
                li.set("C#");//modification
            }

        }
        System.out.println(l);



    }
}
