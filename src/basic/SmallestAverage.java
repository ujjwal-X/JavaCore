package basic;

import java.util.Scanner;

public class SmallestAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        System.out.println(average(first,second,third));
        System.out.println(smallest(first,second,third));
    }
    public static double average(int x, int y, int z){
        return  (x + y + z) /3;
    }
    public  static  int smallest(int x,int y,int z){
        if(x>y && x>z){
            return x;
        } else if (y>z && y>x) {
            return y;
        } else if (z>x && z>y) {
            return z;
        }
        return -1;
    }
}
