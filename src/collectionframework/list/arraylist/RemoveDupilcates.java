package collectionframework.list.arraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDupilcates {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(22);
        al.add(1000);
        al.add(23);
        al.add(25);
        al.add(22);
        al.add(26);
        al.add(28);
        al.add(32);
        al.add(26);
        System.out.println("original ArrayList"+al);
        LinkedHashSet hs=new LinkedHashSet(al);
        System.out.println("Duplicates Removed"+hs);





    }
}
