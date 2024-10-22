package collection.framework.vector;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>();
        System.out.println(v.capacity());
        for (int i=1;i<=10; i++){
            v.add(i);
        }
        System.out.println(v.capacity());
        v.addElement(11);
        System.out.println(v.capacity());


    }
}
