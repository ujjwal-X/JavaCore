package StringPractice;

public class StringConstructor {
    public static void main(String[] args) {
        String str=new String();//Create an empty String object
        System.out.println(str);
        String str1=new String("Java");//String literal
        System.out.println(str1);
        StringBuffer sb=new StringBuffer("java from buffer");
        String str2=new String(sb);
        System.out.println(str2);

        StringBuilder sb1=new StringBuilder();
        String str3=new String(sb1);
        System.out.println(str3);
        char[] a={'j','a','v','a'};
        String str4=new String(a);
        System.out.println(str4);
        byte[] b={97,98,99,100};
        String str5=new String(b);

        System.out.println(str5);
    }
}
