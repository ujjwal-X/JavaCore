package java8.lambdaexpression;
interface Interf1 {
public int square(int x);
}
class Test {
public static void main(String[] args) {
         Interf1 i =(x) -> x*x;
        System.out.println("Square is "+i.square(5));
        }

}