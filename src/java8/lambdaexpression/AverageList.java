package java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageList {
    public static void main(String[] args) {
        List<Double>l= Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);
        double average=l.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println(average);
    }
}
