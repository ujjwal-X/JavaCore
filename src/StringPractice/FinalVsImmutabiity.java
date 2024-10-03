package StringPractice;

public class FinalVsImmutabiity {
    public static void main(String[] args) {
//StringBuffer present in java,lang
        String s1;
        final StringBuffer sb=new StringBuffer("Software");
        sb.append("Devloper");
        System.out.println(sb);
//        sb=new StringBuffer("C++"); gives error because of changing final refremce
//final cant achieve immutability the value of string is changed
//final just make the sb reference  cant changeable but we can change inside content using reference variable
//while immutability works on object

    }

}
