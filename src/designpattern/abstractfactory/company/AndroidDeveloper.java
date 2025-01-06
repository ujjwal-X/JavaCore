package designpattern.abstractfactory.company;

public class AndroidDeveloper implements Employee{
    @Override
    public void salary() {
        System.out.println(40000);
    }

    @Override
    public void name() {
        System.out.println("I am a Android Developer");
    }
}
