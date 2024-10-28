package java8.methodreference;
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
    }
}
