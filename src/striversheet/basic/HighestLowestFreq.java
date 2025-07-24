package striversheet.basic;

import java.util.HashMap;
import java.util.Map;

public class HighestLowestFreq {
    public static void main(String[] args) {
        int[] arr={1, 2, 2, 3, 1, 4, 2, 3, 4, 4};
        Map<Integer,Integer> freq=new HashMap<>();
        freq=countFrequncy(arr,freq);
        highestLowset(freq);
        System.out.println(freq);
    }

    private static void highestLowset(Map<Integer, Integer> freq) {
        int minMarks = Integer.MAX_VALUE;
        int maxMarks = Integer.MIN_VALUE;
        int maxElement=-1,minElement=-1;
        for(Map.Entry<Integer,Integer> k:freq.entrySet()){
            int key=k.getKey();

            int value=k.getValue();
            if(k.getValue()<minMarks){
                minMarks=value;
                minElement=key;
            }
            if(k.getValue()>maxMarks){
                maxMarks=value;
                maxElement=key;
            }
        }
        System.out.println("Minimum frequency element  is"+minElement+" "+minMarks);
        System.out.println("Maximum freuenct element is "+maxElement+" "+maxMarks);
    }

    private static Map<Integer,Integer> countFrequncy(int[] arr, Map<Integer, Integer> freq) {
        for(int i=0; i<arr.length;i++){
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
        }
        return freq;
    }
}
