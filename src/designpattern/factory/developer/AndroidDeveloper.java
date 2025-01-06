package designpattern.factory.developer;

public class AndroidDeveloper implements Employee {
    @Override
    public int getSalary() {
        System.out.println("Getting Android developer salary");
        return 60000;
    }

}
