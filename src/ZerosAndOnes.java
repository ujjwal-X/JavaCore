public class ZerosAndOnes {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,1,0,0,0,1,1,1,1,1,1,2,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.println(arr[i]);
        }

    }
}
