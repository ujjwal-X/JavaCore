package striversheet.sorting;

public class ArrayIsSorted {
    public static void main(String[] args) {
//        [1, 3, 2, 4, 5]
        int[] arr={1,2,3,5,4};
       boolean flag= arrayIsSortedOrNot(arr);
       if(flag){
           System.out.println("Sorted");
       }
       else {
           System.out.println("Not Sorted");
       }
    }

    private static boolean arrayIsSortedOrNot(int[] arr) {
        boolean flag=true;
        for (int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){

            }else{
                flag=false;
                break;
            }
        }
        return flag;
    }
}
