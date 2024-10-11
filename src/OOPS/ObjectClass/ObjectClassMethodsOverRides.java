package OOPS.ObjectClass;
class A{
    int a=10;

//    public boolean equals(A obj) {
//        if(obj==this) {return true;}
//        return true;
//    }


//Using instanceof
//    public boolean equals(A a) {
//        if ((a instanceof A)) {
//            return true;
//        }
//        return true;
//    }



//    public void equals(A a) {
//        System.out.println(a.hashCode());
//    }
}
public class ObjectClassMethodsOverRides {
    public static void main(String[] args) {
        A a=new A();
        A a1=new A();
        String str="Ujjwal";
        String str1="Ujjwal";
        str1=str1.concat("Check");

        System.out.println(str==str1);
        System.out.println(str.equals(str1));
        System.out.println(a1==a);
        System.out.println(a.equals(a1));
//        System.out.println(a.equals(a));

    }
}
