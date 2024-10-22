package array;

public class SumOfarray {
    public static void main(String[] args) {
        int[] arr1=new int[]{10,20,30};
        int[] arr2=new int[]{1,2,3,10};
        int[] arr3=new int[arr2.length];
        for(int i=arr1.length-1; i>=0; i--){

            for(int j=arr2.length-1; j>=0; j--){
                int carry=0;
                carry=arr1[i]+arr2[j]/10;
                arr3[i]=+carry;
                break;
            }
        }
        for(int j=0; j<arr3.length; j++){
            System.out.println(arr3[j]);
        }

    }
}
