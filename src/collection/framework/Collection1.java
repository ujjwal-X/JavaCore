package collection.framework;

import java.util.ArrayList;


interface Icollection{

}


public class Collection1  {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add("a");
        l.add("a");
        l.add(10);
        l.add(10);
        System.out.println(l);
        l.remove(2);
        l.add(2,"Ujjwal");
        System.out.println(l);

    }
}
