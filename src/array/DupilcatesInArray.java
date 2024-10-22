package array;

import java.util.Scanner;

public class DupilcatesInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="";
        int counter=0;
        int size=sc.nextInt();
        int[] arr =new int[size];
        for (int i=0; i<size;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0; i<size;i++){

           for (int j=i+1;j<size; j++){
               if(arr[i]==arr[j]){
                   str+=arr[i];
                   break;
               }
           }
        }
        System.out.println(str);
    }
}
