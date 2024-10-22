package oops.Interface;

interface Netflix{

}

public class InterfaceRules implements Netflix{
    public static void main(String[] args) {
        Netflix n=new InterfaceRules();
        System.out.println(n instanceof Object);

    }
}
//Rule 1 => hey gpt take interview of me on java oops
//Rule 2 => Interfaces should contain only abstract methods. Interfaces should not contain a single concrete method.
//Rule 3 => Interface can have two types of members.  1) Fields     2) Abstract Methods.
//Rule 4 => By default, Every field of an interface is public, static and final (we will discuss about final keyword Later). You can’t use any other modifiers other than these three for a field of an interface.
//Rule 5 => You can’t change the value of a field once they are initialized. Because they are static and final. Therefore, sometimes fields are called as Constants. (We will discuss this feature in detail while covering ‘final’ keyword)
//Rule 6 => By default, All methods of an interface are public and abstract.
//Rule 7 => Like classes, for every interface .class file will be generated after compilation.
//Rule 8 => While implementing any interface methods inside a class, that method must be declared as public. Because, according to method overriding rule, you can’t reduce visibility of super class method. By default, every member of an interface is public and while implementing you should not reduce this visibility.
//Rule 9 => By default, Interface itself is not public but by default interface itself is abstract like below,
//Rule 10 => SIB – Static Initialization Block and IIB – Instance Initialization Block are not allowed in interfaces.
//Rule 11 => As we all know that, any class in java can not extend more than one class. But class can implement more than one interfaces. This is how multiple inheritance is implemented in java.
//Rule 12 =>
