package exceptionalhandling;
/*
* ### some rules of returning value
* If method returns a value and also has try, catch and finally blocks in it, then following two rules need to follow.
* 1) If finally block returns a value then try and catch blocks may or may not return a value.
* 2) If finally block does not return a value then both try and catch blocks must return a value
*
*
* Rules-
* 1 => If try-catch-finally blocks are returning a value according to above rules, then you should not keep any statements after finally block. Because they become unreachable and in Java, Unreachable code gives compile time error..
* 2 => finally block overrides any return values from try and catch blocks.
* 3 => finally block will always be executed even though try and catch blocks are returning the control.
* 4 => Go through the following examples and try to analyse their output.
* 5 =>
* */
public class ReturnValueTryCatch {
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
        System.out.println(methodReturningValue1());
    }
//Condition 1
//    static int methodReturningValue() {
//        try {
//            System.out.println("Opened");
//            return 100;
//
//        } catch (Exception e) {
//
//            return 1000;
//
//        } finally {
//            System.out.println("Closed");
//            return 200;
//        }
//    }
// Condition 2
static String methodReturningValue1() {
        String s = null;
        try
        {
            s = "return value from try block";
            return s;
        }
        catch (Exception e)
        {
            s = s + "return value from catch block";
            return s;
        }
        finally
        {
            s = s + "return value from finally block";
        }
    }
//    Condition 3
static int methodReturningValue() {
        try
        {
            return 10;
        }
        catch (Exception e)
        {
            return 20;
        }
        finally
        {
            System.out.println("finally block is always executed");

        }
    }
}
