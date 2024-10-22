package exceptionalhandling;

public class MultipleHandling {
    public static void main(String[] args) {
        int x=6;
        int y=0;
        int ans=0;
        int[] arr={1,2,3,4};
        String str="";
        try {

            System.out.println(arr[5]);
            ans=x/str.length();
            System.out.println("I am inside try Block");
        }
        catch (ArithmeticException obj){
            System.out.println("Something Went Wrong ======="+obj);
        }
        System.out.println(ans);
    }
}
