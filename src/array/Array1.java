package array;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        double[] x=new double[5];
        System.out.println(x);

        int[] arr=new int[]{11,1,21,2,22,2};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
