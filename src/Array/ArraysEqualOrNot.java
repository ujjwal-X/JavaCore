package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysEqualOrNot {
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,30,40,50};
        int[] arr1=new int[]{20,30,10,40,60};
        int counter=0;
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(arr.length==arr1.length){
            for (int i=0; i<arr.length; i++){
                if (arr[i]==arr1[i]){
                    counter++;
                }
                else {
                    break;
                }
            }
        }
        if(counter==arr.length){
            System.out.println("Equals");
        }
        else {
            System.out.println("Not Equals");
        }

    }
}
