package CollectionFrameWork.Map;


import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap lhm=new LinkedHashMap(16,0.75f,true);
        lhm.put(1,"one");
        lhm.put(2,"two");
        lhm.put(3,"Three");
        lhm.put(4,"Four");
        System.out.println(lhm);
        System.out.println(lhm.get(2));
        System.out.println(lhm);

    }
}
