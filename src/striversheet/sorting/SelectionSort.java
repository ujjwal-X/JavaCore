package striversheet.sorting;


/*
* | Case        | Time Complexity | Explanation                                                                           |
| ----------- | --------------- | ------------------------------------------------------------------------------------- |
| **Best**    | `O(n²)`         | Even if the array is already sorted, it still scans all elements to find the minimum. |
| **Average** | `O(n²)`         | Always makes `n(n-1)/2` comparisons regardless of order.                              |
| **Worst**   | `O(n²)`         | Same number of comparisons and swaps in worst case too.                               |
* | Aspect           | Complexity |
| ---------------- | ---------- |
| **Best Time**    | `O(n²)`    |
| **Average Time** | `O(n²)`    |
| **Worst Time**   | `O(n²)`    |
| **Space**        | `O(1)`     |
| **Stable Sort?** | ❌ No       |
| **In-place?**    | ✅ Yes      |

*
* */

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={52,21,11,553,32,66,12};
        selectionSort(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }

    private static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length; i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    int temp=arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
