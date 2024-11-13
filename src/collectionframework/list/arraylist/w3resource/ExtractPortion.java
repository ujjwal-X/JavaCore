package collectionframework.list.arraylist.w3resource;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortion {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);

        List al1=  al.subList(1,3);
        System.out.println(al1);
    }
}
