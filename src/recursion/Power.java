package recursion;

public class Power {

    static int productPower(int a, int b) {
        if(b == 1) return a;
        return a*productPower(a, b-1);
    }

    public static void main(String[] args) {
        System.out.println(productPower(2, 3));
    }
}
