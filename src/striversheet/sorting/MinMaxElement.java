package striversheet.sorting;


import java.util.Scanner;

// [10, 20, 4, 45, 99, 6]
public class MinMaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        minAndMax(arr);

    }

    private static void minAndMax(int[] arr) {
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(min>arr[i]){
               min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Minimum value is "+min+"   Maximum value is "+max);
    }
}
