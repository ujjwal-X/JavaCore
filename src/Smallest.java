public class Smallest {
    public static void main(String[] args) {
        int [] arr={11,22,33,10,200,5,7,6};
        int small=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println(small);
    }
}
