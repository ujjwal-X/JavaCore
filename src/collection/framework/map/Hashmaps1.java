package collection.framework.map;

import java.util.*;

public class Hashmaps1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap();
        hm.put(1,"deepak");
        hm.put(1,"Vishal");
        hm.put(2,"deepak");
        hm.put(100,"deepak");
//        System.out.println("value => "+hm.put(100,"Riyal"));
//        System.out.println(hm);
//        System.out.println(hm.get(100));
        Set s1=hm.keySet();
        System.out.println(" prints key => "+s1);
        Set set=hm.entrySet();
        System.out.println(set);
        Iterator itr= set.iterator();
        while (itr.hasNext()){
//            Map.Entry me= (Map.Entry) itr.next();
            System.out.println(itr.next());
//            System.out.println(me.getKey()+"  "+me.getValue());

        }
//        for (Map.Entry me:hm.entrySet()) {
//            System.out.println(me.getKey()+"->" +me.getValue());
//        }
//        System.out.println(hm.keySet());
    }
}
