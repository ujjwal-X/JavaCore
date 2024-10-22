package collection.framework.map;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(101,"deepak");
        map.put(102,"deepak");
        map.put(103,"Amit");
        map.put(100,"deepak");
        map.put(null,null);
        map.put(null,1);
        map.put(105,null);
//        System.out.println(map.containsKey(103));
//        System.out.println(map.containsValue(103));
//        System.out.println(map.get(102));
//        System.out.println(map.remove(104));
//        System.out.println(map.replace(103,"JAVA"));
//        System.out.println(map.size());

        System.out.println(map);

        }
    }
