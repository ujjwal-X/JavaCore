package OOPS.ObjectClass.Constructor;


class SuperClassOne
{
    int i;      //Non-Static member

    static void methodOne()
    {
        //static method
        System.out.println("From Super Class");
    }
}

class SuperVsThis extends SuperClassOne {
//    static {
//        System.out.println(super.i);
//        this.methodTwo();
//
//        //Above statements give compile time error
//        //You can't use super and this keywords inside SIB
//    }

//    static void methodTwo() {
//        super.methodOne();
//        this.methodOne();
//
//        //These also give compile time error
//        //You can't use super and this keywords inside static method
//        //even though you are accessing static methods
//    }

    public static void main(String[] args) {

    }
}

//case 1 You should call super() and this() calling statements inside the constructors only and they must be first statement in the constructors.
 //case 2 You can’t use super and this keywords in a static method and in a static initialization block even though you are referring static members.
