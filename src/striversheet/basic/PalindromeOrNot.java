package striversheet.basic;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String str="";
        int n=str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                System.out.println(str+"not a palindrome");
                break;
            }
            System.out.println(str+"is a palindrome");
        }

    }
}
