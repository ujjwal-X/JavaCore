package StringPractice.StringQuestions;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str="         The Lion King    ".trim();
        str=str.replaceAll(" ","");
        System.out.println(str);
    }
}
