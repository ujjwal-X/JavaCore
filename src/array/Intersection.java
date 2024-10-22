package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int arr[]=new int[]{10,19,20,30,40,40,40,50};
        int arr1[]=new int[]{15,16,17,20,25,30,30,40};
        Arrays.sort(arr);
        Arrays.sort(arr1);

        System.out.println(intersection(arr,arr1));

    }
    static ArrayList<Integer> intersection(int[] one, int[] two){
        ArrayList<Integer> a=new ArrayList<>();
        int x=0,y=0;

        while (x<one.length && y<two.length){
            if(one[x]<two[y]){
                x++;
            } else if (one[x]>two[y]) {
                y++;
            }
            else {
                a.add(one[x]);
                x++;
                y++;
            }
        }
        return a;
    }
}
