public class Greater {
    public static void main(String[] args) {
        int[] arr={23,55,1,24,75};
        int greater=0;
        for (int j=0;j<arr.length-1;j++) {
           if(arr[j]<arr[j+1]){
               greater=arr[j+1];
           }
        }
        System.out.println(greater);

    }
}
