package wrapperclass;

public class WrapperClass1 {
    public static void main(String[] args) {
        int x = 7;
        Integer i = 7;  //autoBoxing

        Integer z = Integer.valueOf(i);  //Boxing

        System.out.println("AutoBoxing => " + i);
        System.out.println("Boxing => " + z);

        //z is an Integer wrapper class Object
        int a = z;
        int b = Integer.valueOf(z);
        int c = z.intValue();
        System.out.println("AutoUnBoxing => "+a);
        System.out.println("UnBoxing => "+b);
        System.out.println("unboxing using int value =>"+c);
        System.out.println(z instanceof Integer);
        String str="12345";
//        int integer=Integer.parseInt("invalid"); //Number Format Exception
        System.out.println();
//        int integer=Integer.parseInt("");
    }
}
