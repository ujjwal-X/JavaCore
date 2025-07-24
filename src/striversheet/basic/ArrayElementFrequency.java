package striversheet.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayElementFrequency {
    public static void main(String[] args) {
       int [] arr= {1, 2, 2, 3, 1, 4, 2, 3, 4, 4};
        Map<Integer,Integer> count=new HashMap<>();

        for (int i=0; i< arr.length;i++){
            count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(count);
    }
}



/*
* worst complexity
* for (int i=0; i< arr.length;i++){
            int counter=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j &&arr[i]==arr[j]){
                    counter++;
                }
            }
            count.put(arr[i],counter);
        }

*
* */
