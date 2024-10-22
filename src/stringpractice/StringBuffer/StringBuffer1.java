package stringpractice.StringBuffer;
//String buffer class extends abstract String buffer and abstract String Buffer class import String files methods
public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("300");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Java");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
//        sb.append("Full  Developer [FSWD]");
//
//        System.out.println(sb.capacity());
//        System.out.println(sb.length());

        //equality check == and equals
        StringBuffer sb1=new StringBuffer();
        sb1.append("hello");
        StringBuffer sb2=new StringBuffer();
        sb2.append("hello");
        StringBuffer sb3;
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb1==sb2);
         System.out.println(sb1.equals(sb2));//equals also check reference in string buffer  false because sb1 pointing same reference of sb1 and sb2
    }
}
