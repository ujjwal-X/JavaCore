package java8.stream;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
//      Creates an empty stream
        Stream s=Stream.empty();

        System.out.println(s.count());

//Creates a stream of single element of type T
        Stream s1=Stream.of(new Object());

        System.out.println(s1.count());


//      Creates a stream from values
        Stream s2=Stream.of(10,1,2,4,12,51,1);

        System.out.println(s2.count());

//      Creating streams from collections
        ArrayList al=new ArrayList<>();

        al.add(11);al.add(111);al.add(24);al.add(35);al.add(57);al.add(12411);al.add(35);

        Stream s3=al.stream();

        System.out.println(s3.count());
    }
}
