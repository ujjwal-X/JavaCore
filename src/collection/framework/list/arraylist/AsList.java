package collection.framework.list.arraylist;


import java.util.*;


public class AsList{
    public static void main(String[] args) {
        Vector v=new Vector();
        LinkedList ll=new LinkedList();

        Integer[] arr={10,20,30,40,50,60};

        List al=  Arrays.asList(arr);
        ArrayList all=new ArrayList(al);
        System.out.println(all);

        List v1=Arrays.asList(arr);
        System.out.println(v1);
        List l1=Arrays.asList(arr);
        System.out.println(l1);





    }
}
