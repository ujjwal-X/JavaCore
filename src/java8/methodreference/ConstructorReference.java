package java8.methodreference;

import java.util.function.Function;

class Sample{
    Sample(){
        System.out.println("Sample class Constructor");
    }
    Sample(String s){
        System.out.println("Sample class Constructor "+s);
    }
}
interface Intref1{
//    public Sample get();
    public Sample get(String s);

}

public class ConstructorReference {
    public static void main(String[] args) {
        Intref1 i=Sample::new;
        Sample s1=i.get("Object Created");
        Function<String,Integer> integer=Integer::parseInt;
        System.out.println(integer.apply("100"));
        Function<String,String> str=(s)->s.toUpperCase();
        System.out.println(str.apply("Java"));
    }
}
