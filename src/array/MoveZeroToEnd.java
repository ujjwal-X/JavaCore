package array;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        int j=arr.length-1;
        int n=arr.length;

        String str="Ujjwal";
        String[] tokens=str.split("") ;
        for(int i=0;i<str.length();i++){
            System.out.println(tokens[i]);
        }

//        for(int i=0;i<n;i++){
//            if(arr[i]==0){
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                j--;
//                n--;
//            }
//        }
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
    }
}
