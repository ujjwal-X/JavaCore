package CollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();//default size of ArrayList is 10
        List x=new ArrayList<>();
        //add
        l.add("A");
        l.add(10);
        l.add("A");
        l.add("null");
        System.out.println(l);
        //remover
        l.remove(2);
        //add element on specific place or in between
        l.add(2,"Ujjwal");
        //get element to print specific element
        System.out.println(l.get(2));
        // set Element
        l.set(0,5);//zero index element replace with 5
        System.out.println(l);
        //delete
        l.remove(2);
        l.remove(l.size()-1);
        System.out.println(l);
        //size
        System.out.println(l.size());
        l.add(50);
        l.add(10);
        l.add(2);
        //loops
        for (int i=0; i<l.size();i++){
            System.out.println(l.get(i));
        }

        //sorting
        Collections.sort(l);
        System.out.println(l);

    }
}
