public class Main {
 public static void main(String[] args) {
    double     x = 0.1;
 double y=0.2;
      double   z = 0.3;
      System.out.println(x + y == z);
      System.out.println(x);
      A a = new A();
      B b = new B();
      String s1 = "Java";
      String s2 = "java";
      System.out.println(s1.equals(s2));
      System.out.println(s1==s2);
    //   System.out.println(a.x + b.y);
    //   System.out.println(a.x == b.y);
    //   System.out.println(a.equals(b));
      
      

    }
}

class A {
    String x = "10";
}

class B {
    String y = "10";
}