package collection.framework.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add(40);
        al.add(10);
        al.add(80);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        int x=(Integer)al.get(0);
        int y=(Integer)al.get(al.size()-1);



        System.out.println(x+y);

    }
}
