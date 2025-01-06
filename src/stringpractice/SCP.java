package stringpractice;

public class SCP {
    public static void main(String[] args) {
        String s1="Ram";
                String s2=new String("Ram");
                String s3="Ram";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
    }
}
