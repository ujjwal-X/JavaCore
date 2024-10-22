package collection.framework.map.hashmap;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        //count number of key and value
        System.out.println(hash_map.size());

        System.out.println();
        System.out.println(hash_map);


//shallow copy
        System.out.println("The Original map: " + hash_map);
        HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>();
        new_hash_map = (HashMap)hash_map.clone();
        new_hash_map.put(1,"Orange");
        System.out.println("Cloned map: " + new_hash_map);
        System.out.println("Original"+hash_map);
//        keys in map
        System.out.println(hash_map.keySet());
        System.out.println(hash_map.values());
        System.out.println(hash_map.get(3));

    }
}
