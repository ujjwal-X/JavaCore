import java.util.* ;
import java.io.*;
import java.util.Scanner;

class Prime {
    int counter=0;
    int prime=0;

    int totalPrime(int s,int e){
        for(int i=s; i<=e; i++){
            counter=0;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    counter=1;
                    break;
                }
                else{

                    counter++;
                }
            }

            if(counter==0){
                System.out.println(i);

                prime++;
            }

        }
        return prime;

    }
}

class Solution {
    public static void main(String args[]) {

        Prime obj = new Prime();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(obj.totalPrime(s, e));
    }
}
		
			