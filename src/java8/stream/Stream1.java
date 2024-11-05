package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList();
        a.add(0);
        a.add(10);
        a.add(15);
        a.add(20);
        a.add(25);
        ArrayList<Integer> marks =new ArrayList<>();
        marks.add(70);
        marks.add(45);
        marks.add(10);
        marks.add(65);
        marks.add(20);
        marks.add(25);
        System.out.println("Marks obtained by student"+marks);
        List<Integer> FilteredMarks=a.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(FilteredMarks);
        List<Integer> l1=a.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(l1 );
        //count=>
        long failed=marks.stream().filter(i->i<30).count();
        System.out.println(failed);
        //sorted => (i1,i2)->i1.compareTo(i2) we can use comparable also  this is for ascending
        //(i1,i2)->i2.compareTo(i1) this is for descending
        List<Integer> sorted=marks.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted marks in ascending order"+sorted);
        List<Integer> dsecSorted=marks.stream().sorted(((i1,i2)->i1>i2?-1:i1<i2?1:0)).collect(Collectors.toList());
        System.out.println(dsecSorted);



        ArrayList<String> lang=new ArrayList<>();
        lang.add("Java");
        lang.add("C++");
        lang.add("C#");
        lang.add("Ruby");
        lang.add("JavaScript");
        lang.add("React");
        System.out.println("Original Language"+lang);
        List<String> langsort=lang.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted language"+langsort);
        List<String> desecSort=lang.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("Descending order -> "+desecSort);

    }
}
