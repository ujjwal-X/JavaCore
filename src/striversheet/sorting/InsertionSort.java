package striversheet.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={64, 25, 12, 22, 11};
        //25,64...
        //
        insertionSort(arr);
        for (int a:arr){
            System.out.println(a+" ");
        }
    }
    private static void insertionSort(int[] arr){
        for (int j=0;j< arr.length; j++){
            for (int i=1; i< arr.length;i++){
                if(arr[i]<arr[i-1]){
                    int temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;

                }
            }
        }

    }
}
