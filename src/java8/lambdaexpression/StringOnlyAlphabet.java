package java8.lambdaexpression;

import java.util.function.Predicate;

public class StringOnlyAlphabet {
    public static void main(String[] args) {
        Predicate<String> str=(s)->{
          if(s.isEmpty()){
              return false;
          }
          for (char c:s.toCharArray()){
              if(Character.isDigit(c)){
                  return false;
              }
          }
          return true;
        };
        if(str.test("GeekGeek")){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
