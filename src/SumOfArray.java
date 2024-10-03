import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr={11,22,3,124,4,5,6,982};
        Arrays.sort(arr);
        for (int index:arr) {
            System.out.print(index+" ");
        }
        System.out.println("Largest number is "+arr[arr.length-1]);
        System.out.println("Smallest number is "+arr[0]);


    }
}
