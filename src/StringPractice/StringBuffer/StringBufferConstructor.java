package StringPractice.StringBuffer;

public class StringBufferConstructor {
    public static void main(String[] args) {
        StringBuffer b=new StringBuffer();//default Constructor with 16 value
        System.out.println(b.capacity());
        StringBuffer sb=new StringBuffer(100);//in this we can define the capacity of the String
        System.out.println(sb.capacity());
//        dangerous constructor
        StringBuffer sb1=new StringBuffer("Durga");//int capacity = (length < Integer.MAX_VALUE - 16)? length + 16 : Integer.MAX_VALUE;
        System.out.println(sb1.capacity());//indirectly what happen is default capacity + string.length

    }
}
