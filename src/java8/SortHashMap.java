package java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<String, Integer>();

        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);

        Map<String,Integer> AscendingOrder =new TreeMap<>(studentMap);
        System.out.println(AscendingOrder);


        Map<String,Integer> DescendingOrder=new TreeMap<>(Collections.emptyMap());
        DescendingOrder.putAll(studentMap);


        System.out.println(DescendingOrder);

    }
}
