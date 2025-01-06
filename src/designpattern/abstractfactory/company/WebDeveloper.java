package designpattern.abstractfactory.company;

public class WebDeveloper implements Employee{

    @Override
    public void salary() {
        System.out.println(30000);
    }

    @Override
    public void name() {
        System.out.println("i am a web Developer");
    }
}
