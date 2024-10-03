import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        char x=sc.next().charAt(0);
        System.out.println(x);
        int ans=1;
        while(num!=0){
            ans=ans*num;
            num--;
        }
        System.out.println(ans);
    }
}
