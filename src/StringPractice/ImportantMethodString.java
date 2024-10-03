package StringPractice;

public class ImportantMethodString {
    public static void main(String[] args) {
        String str1="s";
        String str2="p";
        {
            String str4;

        }
        String str="Java String   ";
        System.out.println(str.isEmpty());//checks String length if string is 0 the return true or else false
        System.out.println(str.isBlank());//indexOfNonWhitespace() == length();  Returns true if the string is empty or contains only white space
        System.out.println(str.length());
        System.out.println(str);
        System.out.println(str.replace(" ","J"));//first parameter for char present in string and second for which char you want to change
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,7));//begin index end index(end index-1)
        System.out.println(str.indexOf("s"));//if charater is not available it prints -1 and if available it prints index of that char
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.trim().length());


// conclusion about string immutibality
        String s1=new String("durga");
        String s2=s1.toUpperCase();
        String s3=s1.toLowerCase();
        System.out.println(s1==s2);
        System.out.println(s1==s3);

    }
}

