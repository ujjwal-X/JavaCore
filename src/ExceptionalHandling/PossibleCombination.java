package ExceptionalHandling;

public class PossibleCombination {
//    case 1 only hello and finally is acceptable  without catch you can write try and finally
//    case 2 you cant write try block alone either have catch and finally  CE= try without catch or finally
//    case 3 you cant write catch block alone  CE => catch without try
//    case 4 you cant write finally black alone  CE=> finally without try
//    case 5 order must be try catch finally => if you write try finally catch its invalid
//    case 6 multiple finally is not allowed  only one finally with one try but catch can be multiple with different exception
//    case 7 we cant write any statement in middle of try catch and finally inside that block we write it but outside the state
//    -ment we cant do that it will show them separately
//    case 8 while nesting all of these you have to follow order and all the rules present in above
//    case 9 for try catch and finally block curly braces are compulsory.


    public static void main(String[] args) {
        try{
            System.out.println("hello");
        }
        finally{
            System.out.println("finally");
        }
        try {
            System.out.println("try2");
        }
        finally{
            System.out.println("Finally2");
        }


    }
}
