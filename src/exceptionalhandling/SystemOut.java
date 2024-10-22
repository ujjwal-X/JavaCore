package exceptionalhandling;

public class SystemOut {
    public static void main(String[] args) {
        try{
            System.out.println("Try");
            System.exit(0);//this will shutdown the jvm and finally block didn't execute
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally");
        }
    }
}
