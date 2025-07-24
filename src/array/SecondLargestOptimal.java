package array;

public class SecondLargestOptimal {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        int secondLargest=findingSecondLargestElement(arr);
        int secondSmalles=findingSecondSmallestElement(arr);
        System.out.println(secondLargest+" "+secondSmalles);
    }
    public static int findingSecondLargestElement(int[] arr) {
        int largest = arr[0];
        int secondLargest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

        }
        return secondLargest;
    }
    public static int findingSecondSmallestElement(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
