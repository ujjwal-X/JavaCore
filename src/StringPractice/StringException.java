package StringPractice;

public class StringException {
    public static void main(String[] args) {
        String s1=new String("java");
        String s2=s1.toUpperCase();
        String s3=s1.toLowerCase();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
