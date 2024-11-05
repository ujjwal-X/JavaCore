package java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("Carry Minati");
        a.add("Jonathan");
        a.add("Scout");
        a.add("Triggered Insaan");
        a.add("Sourabh Shukhla");
        System.out.println(a);
        Comparator<String> c=(i1,i2)->{
            int l1=i1.length();
            int l2=i2.length();
            if(l1<l2)return -1;else if (l1>l2) return 1;
            else return i1.compareTo(i2);
        };
        List<String> l=a.stream().sorted(c).collect(Collectors.toList());
        System.out.println(l);
    }
}
