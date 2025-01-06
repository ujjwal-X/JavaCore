package designpattern.factory.developer;

public class DeveloperClient {

    public static void main(String[] args) {
       Employee a= EmployeeFactory.getEmployee("Android Developer");
        System.out.println(a.getSalary());
    }
}
