package ExceptionalHandling;

public class ExceptionBasic {
    public static void main(String[] args) {
//                System.out.println("This statement will be executed");
//
//                Integer I = new Integer("abc");  //This statement throws NumberFormatException
//
//                System.out.println("This statement will not be executed");

//above exception is solved

        System.out.println("This statement will be executed");
        System.exit(0);
        try
        {
            System.out.println("Try block");
//            Integer I = new Integer("abc");  //This statement throws NumberFormatException
        }
        catch (Exception e)
        {
            System.out.println("exception caught");
        }
        finally {
            System.out.println("Finally block");
        }

        System.out.println("Now, This statement will also be executed");
    }
}
