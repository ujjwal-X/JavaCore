package ExceptionalHandling;

public class MethodsPrintException {
    public static void main(String[] args) {
        try{
            System.out.println("Statement1");
            System.out.println(11/0);
            System.out.println("Statement 3");
        }
        catch (Exception e){
           e.printStackTrace();
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());

        }

    }
}
