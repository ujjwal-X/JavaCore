package gfgsdesheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayLeader {
    //arr[] = [16, 17, 4, 3, 5, 2] o/p=[17 5 2]

    public static void main(String[] args) {
        int[] arr=new int[]{0,-1,-10,0,0};
        ArrayList<Integer> a=new ArrayList<>();


//        for(int i = 0; i < arr.length ; i++){
//            int largest = 0;
//            int t = 0;
//            for(int j = i  ; j< arr.length ; j++){
//                if(arr[j] > largest){
//                    largest = arr[j];
//                    t=j;
//                }
//            }
//            i = t;
//            a.add(largest);
//        }

//        System.out.println(a);
        HashSet<Integer> h=new HashSet<>(Arrays.asList(1,2,3,4,5,124,1,15));
        HashSet<Integer> h2=new HashSet<>(Arrays.asList(1,553,124,1,15,2,5,4));
        System.out.println(h.equals(h2));
        System.out.println(h);
        System.out.println(h2);




    }
}
