package designpattern.abstractfactory.company;

public class AndroidDevFactory extends AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
