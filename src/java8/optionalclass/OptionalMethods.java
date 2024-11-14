package java8.optionalclass;
import java.util.ArrayList;
import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) {
        ArrayList<String> al =new ArrayList();
        al.add("Vishal");
        al.add("Manoj");
        al.add("Java");
        al.add(null);
        al.stream().map(str->Optional.ofNullable(str).map(String::length)).forEach(System.out::println);


//        isPresent->
//        Optional<String> opt = Optional.ofNullable("null");
//        if(opt.isPresent()){
//            System.out.println(opt.get());
//
//        }
//        else {
//            System.out.println("object not found");
//        }
//        ifPresent->
//        opt.ifPresent(value-> System.out.println(value));



//        Optional<String> opt = Optional.ofNullable("null");
//
//        String result = opt.orElse("Default Value");
//        System.out.println(result); // Output: Default Value
//        al.stream().map(i->Optional.ofNullable(i).map(String::length)).forEach(System.out::println);
    }
//     Optional<String> name=getName();
//     String nameToBeUsed=name.orElse("NA");
//     System.out.println(nameToBeUsed);
//    private static Optional<String> getName(){
//        return Optional.ofNullable(null);
//    }





}



//Creation: of(), ofNullable(), empty()
//Checking: isPresent(), ifPresent()
//Default Values: orElse(), orElseGet(), orElseThrow()
//Transformation: map(), flatMap()
//Filtering: filter()