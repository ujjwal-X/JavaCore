package collection.framework.list.arraylist.w3resource;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
    }
}
