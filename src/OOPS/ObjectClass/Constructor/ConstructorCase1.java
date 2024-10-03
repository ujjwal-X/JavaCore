package OOPS.ObjectClass.Constructor;
class A{
    int x;
    A(){

    }
    A(int j){
        x=j;
    }
}
class B   /*extends A*/{//There is no default constructor available in 'OOPS.ObjectClass.Constructor.A'

}
//You will get a compile time error saying implicit default constructor A() is undefined for Class A. Compiler will force you to
// write constructor in Class B. Because, we are not defining constructor for Class B. So, compiler will be providing default
// constructor. In that default constructor, first statement is super() – it is a calling statement to default constructor of
// Class A. But it is not defined in Class A. Therefore you will get a compile time error. To avoid this error, write the
// constructor for subclass. From that constructor call super class constructor explicitly. See the below code,

public class ConstructorCase1 {
    public static void main(String[] args) {
        B b=new B();
    }
}

//some rules
//1-> Any class can not extend itself i.e
//2->



