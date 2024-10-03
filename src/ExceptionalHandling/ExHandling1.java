package ExceptionalHandling;

public class ExHandling1 {
    public static void main(String[] args) {
        int x=6;
        int y=0;
        int ans=0;
        try {
            System.exit(1);
            ans=x/y;
            System.out.println("I am inside try Block");

        }
        catch (Exception obj){
            System.out.println("Something Went Wrong ======="+obj);

        }
        finally {

            System.out.println("Finally Block");
        }
        System.out.println(ans);
    }
}
