package WrapperClass;

public class WrapperClass1 {
    public static void main(String[] args) {
        int num=7;
        Integer num1=num;//autoboxing When we are
        // Converting primitive data type corresponding
        // to its non-primitive data type wrapper type
        // is called AutoBoxing
        Integer num2= num;
        System.out.println(num2);
        int num3=num2;//unboxing  its is a process of converting non-primitive data correspondence to its primitive data
        System.out.println(num3);
        String str="12";


    }
}
