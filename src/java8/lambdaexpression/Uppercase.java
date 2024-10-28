package java8.lambdaexpression;
 interface IUpperCase{
     abstract int hashCode();
     String upperCase(String str);
 }
public class Uppercase {
    public static void main(String[] args) {
        IUpperCase u=(str)->str.toUpperCase();
        System.out.println(u.upperCase("ujjwal"));
        
    }
}
