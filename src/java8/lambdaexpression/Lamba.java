package java8.lambdaexpression;

public class Lamba {
    public static void main(String[] args) {
        Employee employee=()->"Software Engineer";
        System.out.println(employee.getname());
        Employee tester=()->"Tester";
        System.out.println(tester.getname());
    }
}
