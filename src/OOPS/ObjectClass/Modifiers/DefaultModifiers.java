package OOPS.ObjectClass.Modifiers;

public class DefaultModifiers {
    private void display1(){
        System.out.println("private");//within class
    }
    void display2(){
        System.out.println("Default");//within class and withing package
    }
    protected void display3(){
        System.out.println("Protected");//within class withing package withing subclass of another package
    }
    public void display4(){
        System.out.println("Public");//everywhere
    }


}
