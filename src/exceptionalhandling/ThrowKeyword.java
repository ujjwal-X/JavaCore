package exceptionalhandling;

public class ThrowKeyword extends RuntimeException {
//  case 2  static ArithmeticException e;
    public static void main(String[] args){
//  case1=      ArithmeticException e=new ArithmeticException();
//
//        throw e;
//        case 2

//      case 2   throw e;
//      case 3 => Compiler don't know at this point we are going to get an ArithmeticException in this case we will only get runtime error
//        System.out.println(10/0);
//        System.out.println("hello");
//        case 4=>in the below case compiler know because of throw keyword it is compile
//        throw new ArithmeticException("/ by boozer");
//        System.out.println("hello");unreachable Statement because compiler know it will not work

//        case 5 => we can only use throwable classes for throwing explicit
//        keyword normal classes is not going to work utill or unless it is a parent classes of any throwble child using extends
//        throw new ThrowKeyword();
//        case 6 =>but in this case we will extend RuntimeException  class in ThrowKeyword class
        throw new ThrowKeyword();

    }
}
