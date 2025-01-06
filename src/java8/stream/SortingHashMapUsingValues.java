package java8.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingHashMapUsingValues {
    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);


        Map<String,Integer> ascending=studentMap.entrySet().stream().sorted(Map.Entry.comparingByValue((o1,o2)->o1.compareTo(o2))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2)->e1, LinkedHashMap::new));
        System.out.println(ascending);

        //descending
        Map<String,Integer> sorted=studentMap.entrySet().stream().sorted(Map.Entry.comparingByValue((o1,o2)->o2.compareTo(o1))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2)->e1, LinkedHashMap::new));

        System.out.println(sorted);
    }
}
