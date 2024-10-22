package collection.framework.list.arraylist.w3resource;

import java.util.ArrayList;

public class CompareTwo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(1000);
        al.add(600);
        ArrayList al1=new ArrayList<>();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        al1.add(500);
        al1.add(600);
        ArrayList al2=new ArrayList<>();

        for (Object z:al) {
            if(al1.contains(z)){
                al2.add(z);
            }

        }
        System.out.println(al2);
    }
}
