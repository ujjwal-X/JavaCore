package array;

import java.util.ArrayList;

public class ArrayLeader {


    public static void fact(int[] arr, int i, int j){
        if(i==j){
            System.out.print(i+" ");
            return;
        }
        int max1=0;
        int index=0;
        while(i<j){
            if(max1<arr[i]){
                max1=arr[i];
                index=i;
            }
            i++;
        }
        System.out.println(max1+" ");
        fact(arr, index, j);
    }


    public static void main(String[] args) {
        int[] arr= {16, 17, 4, 3, 5, 2};
//      /  ArrayList<Integer>al =new ArrayList<>();
       fact(arr,0,arr.length);

//        int largest=0;
//        int index=0;
//
////        int largest=arr[0];
////        int[] leader={};
////        int index=0;
////
////            for(int i=index+1;i<arr.length;i++){
////                if(largest<arr[i]) {
////                    int j=0;
////                    index = i;
////                    largest = arr[i];
////                    leader[j]=largest;
////                    j++;
////                }
////
////            }
////
////        for(int i=0;i<leader.length;i++){
////            System.out.println(leader[i]);
////        }
//        for(int i=index;i< arr.length;i++){
//            for(int j=index+1;j<arr.length;j++){
//                if(arr[i]<arr[j]) {
//                    index=j;
//                    largest=arr[j];
//                    al.add(largest);
//                }
//            }
//        }
//        al.add(arr[ar]);
//        System.out.println(al);

    }
}
