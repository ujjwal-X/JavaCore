package java8.lambdaexpression;

public class StringEmptyOrNot {
    public static void main(String[] args) {
        EmptyOrNot s=(str)->str.isEmpty();
        System.out.println(s.isEmpty(""));
        System.out.println(s.isEmpty("Java"));

    }
}
