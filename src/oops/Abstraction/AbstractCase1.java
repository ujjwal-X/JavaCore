package oops.Abstraction;

public class AbstractCase1 {
    public static void main(String[] args) {

    }
}
//Rules 1 => Abstract classes and abstract methods are declared using ‘abstract‘ keyword. We can’t create objects to those classes
// which are declared as abstract. But, we can create objects to sub classes of abstract class, provided they must implement
// abstract methods.
//Rule 2 => The methods which are not implemented or which don’t have definitions must be declared with ‘abstract’ keyword and the
// class which contains it must be also declared as abstract.
//Rule 3 =>It is not compulsory that abstract class must have abstract methods. It may or may not have abstract methods. But the
// class which has at least one abstract method must be declared as abstract.
//Rule 4 => You can’t create objects to abstract class even though it does not contain any abstract methods.
//Rule 5=> Abstract Class can be a combination of concrete and abstract methods.
//Rule 6 => Any class extending an abstract class must implement all abstract methods. If it does not implement, it must be declared as abstract.
//Rule 7 => Inside abstract class, we can keep any number of constructors. If you are not keeping any constructors, then compiler will keep default constructor.
//Rule 8 => Abstract methods can not be private. Because, abstract methods must be implemented somehow in the sub classes. If you declare them as private, then you can’t use them outside the class.
//Rule 9 =>Constructors and fields can not be declared as abstract.
//Rule 10 => 