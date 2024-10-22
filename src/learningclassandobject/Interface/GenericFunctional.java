package learningclassandobject.Interface;
@FunctionalInterface
interface Plus<T>{
T add(T a,T b);
}
//we can pass class also
//interface  Minus<T extends Person>{
//
//}
//class Person{
//
//}
public class GenericFunctional {
    public static void main(String[] args) {
Plus <Integer> a=(b,c)->b+c;
        System.out.println(a);
    }
}
