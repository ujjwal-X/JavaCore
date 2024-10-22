package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        int largest=0;
        int whichPosition=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter array [ "+size+" ] values ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter which largest value you want to find");
        whichPosition=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0; i<size-1; i++){
            if(arr[i]<arr[i+1]){
                largest=arr[i+1];
            }else {
                largest=arr[i];
            }
        }
        int secondLargest=0;
        while (whichPosition-1!=0){
            for(int i=size-1; i>=0; i--){
                if(arr[i]<largest){
                    secondLargest=arr[i];
                    largest=secondLargest;
                    break;
                }
                

            }
            whichPosition--;

        }

        System.out.println(secondLargest);
    }
}
