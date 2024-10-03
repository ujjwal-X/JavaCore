public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int x= arr.length-1;
        for(int i=0; i< (arr.length-1)/2;i++){
            int temp=arr[i];
            arr[i]=arr[x];
            arr[x]=temp;
            x--;
        }
        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.print(arr[i]);
        }
    }
}
