package java8.lambdaexpression;

 interface Interf {
     public void methodOne();
 }
 class Demo implements Interf {
    public void methodOne() {
        System.out.println("method one execution");
    }
}
public class Main {
    public static void main(String[] args) {
            Interf i = new Demo();
             i.methodOne();
            }
}