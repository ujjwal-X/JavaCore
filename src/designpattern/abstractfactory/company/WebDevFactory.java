package designpattern.abstractfactory.company;

public class WebDevFactory extends AbstractEmployeeFactory {

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
