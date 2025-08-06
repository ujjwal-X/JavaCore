package striversheet.sorting;

import java.util.Scanner;


/*
* Input: [10, 20, 4, 45, 99, 6]
 Output: Second largest element: 45
* */
public class SecondLargestandMinimum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
        int[] arr= {10, 20, 4, 45, 99, 6};
//        for(int i=0; i<size;i++){
//            arr[i]=sc.nextInt();
//        }
        secondLargestMinimum(arr);

    }

    //6
    //10 20 4 45 99 6

    private static void secondLargestMinimum(int[] arr) {
//        int max=arr[0],secondMax=0;
//        int min=arr[0],secondMin=0;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                secondMax=max;
                max=arr[i];
            } else if (secondMax<arr[i]) {
                secondMax=arr[i];

            }
            if(min>arr[i]){
                secondMin=min;
                min=arr[i];
            }
            else if (secondMin>arr[i]) {
                secondMin=arr[i];

            }
        }
        System.out.println(secondMin+"   "+secondMax);
    }
}
