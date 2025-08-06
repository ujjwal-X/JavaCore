package striversheet.sorting;

public class RemoveDuplicates {
    public static void main(String[] args) {
//        [1, 1, 2, 2, 3, 4, 4, 5]
        int[] arr={1,1,2,2,3,4,4,5};
        removeDuplicates(arr);
        for (int a:arr){
            System.out.println(a);
        }

    }

    private static void removeDuplicates(int[] arr) {
        int i=0,j=0;
        while(i<arr.length){
            while (j<arr.length){
                if(arr[i]!=arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    i=j;
                    i++;
                }
                j++;
            }
        }
    }


}
