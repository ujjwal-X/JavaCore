import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int first=0;
        int second=1;
        System.out.print(first+" ");
        System.out.print(second+" ");
        for (int i = 0; i <n ; i++) {
            int third=first+second;
            System.out.print(third+" ");
            int temp=first;
            first=second;
            second=third;
        }

    }
}
