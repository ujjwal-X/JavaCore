package java8.lambdaexpression;

public interface Add {
    int addition(int a,int b);
    default void print(){
        System.out.println("default method");
    }
}
