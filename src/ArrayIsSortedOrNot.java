public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
//        int[] arr={20,21,45,89,89,90};
        int[] arr={20,20,78,98,99,97};

        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Array is not sorted");
                break;
            }
            else{
                if(i==arr.length-2){
                    System.out.println("Array is sorted");
                }
            }
        }
    }
}
