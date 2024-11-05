package java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionFI  {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(100);
        a.add(10);
        a.add(200);
        a.add(40);
        a.add(500);
        Comparator<Integer>c=(i1,i2)->(i1>i2)?1:(i1<i2)?-1:0;
        Collections.sort(a,c);
        System.out.println(a);
    }
}
