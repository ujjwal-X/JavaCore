package stringpractice;

public class StringExample1 {
    public static void main(String[] args) {
        String str1=new String("Durga");
        String str2=new String("Durga");
        String str3="Durga";
        str3="Ujjwal";
        String str4="Ujjwal";
        System.out.println(str3==str4);
        System.out.println(str3);
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str3==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));


    }
}
