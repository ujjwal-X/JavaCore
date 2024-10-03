package ExceptionalHandling;

public class ControlFlow2 {
    public static void main(String[] args) {
     //what happen if exception is raised in catch block
        try{
            System.out.println("Statement1");
            System.out.println("Statement2");
        }
        catch (Exception x){
            System.out.println("Exception block");
        }
        finally {
            System.out.println(10/0);
        }
        System.out.println("outer Statement");
    }
}
