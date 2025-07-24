package striversheet.recusrion;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,23,3,4,5,5,7,8,9};
        reverseAnArray(arr,0,arr.length-1);
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void reverseAnArray(int[] arr,int start,int end) {
        if(start==end){
            return;
        }
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
