package ExceptionalHandling;

public class NumberFormatExceptions {
    public static void main(String[] args) {
        int i=Integer.parseInt("10");
        int j=Integer.parseInt("ten");//ten is string not an integer value
        System.out.println(i);
        System.out.println(j);

    }
}
