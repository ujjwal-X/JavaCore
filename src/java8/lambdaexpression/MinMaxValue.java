package java8.lambdaexpression;
import java.util.function.Function;

public class MinMaxValue {
    public static void main(String[] args) {
        Function<Integer[],Integer> max=(i)->{
            Integer largest=i[0];
            for(int z=0; z<i.length-1; z++){
                if(largest<i[z+1]){
                    largest=i[z+1];
                }

            }
            return largest;
        };
        Function<Integer[],Integer> minimum=(i)->{
            Integer min=i[0];
            for(int z=0; z<i.length-1; z++){
                if(min>i[z+1]){
                    min=i[z+1];
                }

            }
            return min;
        };
        Integer[] arr={10,2,5,77,5};
        System.out.println(max.apply(arr));
        System.out.println(minimum.apply(arr));
    }
}
