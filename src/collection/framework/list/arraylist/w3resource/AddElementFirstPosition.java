package collection.framework.list.arraylist.w3resource;

import java.util.ArrayList;

public class AddElementFirstPosition {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
//        System.out.println("How many values you want to insert");
        al.add(0,100);
        al.add(0,200);
        al.add(0,300);
        al.add(0,400);
        System.out.println(al);
        al.remove(2);

        System.out.println(al);
    }
}
