package exceptionalhandling;

import java.io.PrintWriter;

public class CheckedException {
    public static void main(String[] args)  {
        try {
            PrintWriter pw=new PrintWriter("abc.txt");
            pw.println("Hello");
            System.out.println("Helllllo");
        }

        catch (Exception e){
            e.printStackTrace();
        }
        

               /*This above red line shows by the compiler that you cant handle the exception
         *compiler will check weather the exception is handled by the programmer or not
         *
         */


    }
}
