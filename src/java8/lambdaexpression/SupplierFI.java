package java8.lambdaexpression;

import java.util.function.Supplier;

public class SupplierFI {
    public static void main(String[] args) {
        Supplier<Double> getRandomDoublee=()->Math.random();
        System.out.println(getRandomDoublee.get());
    }
}
