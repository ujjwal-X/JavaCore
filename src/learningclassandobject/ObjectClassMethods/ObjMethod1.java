package learningclassandobject.ObjectClassMethods;
/*
* The toString() provides a String representation of an object and is used to convert an object to a String. The default toString() method for
* class Object returns a string consisting of the name of the class of which the object is an instance, the at-sign character `@’, and the unsigned
*  hexadecimal representation of the hash code of the object.
* */
class ToStirng{
}

public class ObjMethod1 {
    public static void main(String[] args) {
        ToStirng t=new ToStirng();
//        String and wrapper class overrides the toString method
        Integer i=new Integer("100");
        String str=new String("String");
        System.out.println(i);
        System.out.println(str);



        System.out.println("this is reference Variable => "+t);
        System.out.println("in this toString method is used => "+t.toString());

//        System.out.println(t.equals(t));
//        System.out.println(t.equals(t1));
//        System.out.println(t.equals(t2));
        System.out.println(t.getClass().getName());

    }
}
