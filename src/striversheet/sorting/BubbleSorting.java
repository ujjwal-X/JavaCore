package striversheet.sorting;

/*
* | Case        | Time Complexity | Explanation                                                                        |
| ----------- | --------------- | ---------------------------------------------------------------------------------- |
| **Best**    | `O(n)`          | When the array is already sorted and optimized version is used (with a swap flag). |
| **Average** | `O(n²)`         | Nested loops compare and swap elements, leading to quadratic time.                 |
| **Worst**   | `O(n²)`         | When the array is reverse sorted, all pairs are compared and swapped.              |

*
* | Aspect           | Complexity |
| ---------------- | ---------- |
| **Best Time**    | `O(n)`     |
| **Average Time** | `O(n²)`    |
| **Worst Time**   | `O(n²)`    |
| **Space**        | `O(1)`     |
| **Stable Sort?** | ✅ Yes      |
| **In-place?**    | ✅ Yes      |

* */

public class BubbleSorting {

    public static void main(String[] args) {
        int arr[]={52,21,11,553,32,66,12};
        bubbleSort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }

    private static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for (int j=0; j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
}



/*
*  Optimized Bubble Sort (with early exit)
private static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        boolean swapped = false;
        for (int j = 0; j < n - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        // If no swaps in this pass, array is already sorted
        if (!swapped) break;
    }
}
* in first loop if everything is sorted then swapped remans false and then we can break it or return -1 that array is alredy sorted
* */
