package ExceptionalHandling;

public class ControlFlow1 {
    public static void main(String[] args) {
        try{
            System.out.println("Statement1");
            System.out.println(11/0);
            System.out.println("Statement 3");
        }
        catch (Exception e){
            System.out.println("Statement 4");
        }

        System.out.println("Statement 5");
    }

}
/*case1 if there is no exception 1,2,3,5 NT
* case2 if an exception raised at statement2 and catch block matched 1,4,5,normal termination
* case3 if an exception raised at statement 2 and catch block not matched  1,AT
* case4 if an exception raised   AT
* */
