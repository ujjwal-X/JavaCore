package java8.lambdaexpression;

import java.util.function.Predicate;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr={10,2,3,4,5,10,24};
        Predicate<Integer> num=(x)->x%2==0;
        for(int i=0;i<arr.length;i++){
            if(num.test(arr[i])){
                System.out.println(arr[i]+" is even");
            }
            else {
                System.out.println(arr[i]+" is odd");
            }
        }


    }
}
