package array;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,3};
        ArrayList<Integer>list=removeDupilcate(arr);
        System.out.println(list);
    }
    public static ArrayList<Integer> removeDupilcate(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(arr[0]);
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]==arr[j]){
                j++;
            }
            else if(arr[++i]!=arr[j]) {
                list.add(arr[j]);
               j++;
            }
        }
        return list;
    }
}
