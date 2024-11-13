package collectionframework.list.arraylist.w3resource;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArraylist {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);
        System.out.println(al);

        ArrayList al1=new ArrayList(al);
//        System.out.println(al1);
        ArrayList al3=new ArrayList();//al.size()
        Collections.copy(al3,al);
        System.out.println(al3);


    }
}
