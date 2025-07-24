package striversheet.basic;

public class GCDLCM {
    public static void main(String[] args) {
        int num1=12,num2=18;
        int lcm=findingLcm(num1,num2);
        int gcd=findingGcd(num1,num2);
        System.out.println(lcm);
        System.out.print(gcd);
    }

    private static int findingGcd(int n, int m) {
        int gcd=0;
        while(m!=0){
            int temp=m;
            m=n%m;
            n=temp;
            gcd=n;
        }
        return gcd;
    }

    private static int findingLcm(int n, int m) {
        int x=0;
        for(int i=1;i<=n*m;i++){
            if(i%n==0 && i%m==0){
                x=i;
                break;
            }

        }
        return x;
    }
}
