package collectionframework.map;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap<>();
        tm.put(1000,null);
        tm.put(2000,11);
        tm.put(1,"Tom");
        tm.put(100,"Tom");
        tm.put(200,"Tom");
        System.out.println(tm);
        tm.forEach((k,v)-> System.out.println("key ="+k +" Value ="+v));



    }
}
