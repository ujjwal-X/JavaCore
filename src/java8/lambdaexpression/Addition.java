package java8.lambdaexpression;

public class Addition {
    public static void main(String[] args) {
        Add a=(x,y)-> x+y;
        System.out.println(a.addition(10,20));
    }


}
