package striversheet.recusrion;
//@hmaracollege
public class StringIsPalindrome {
    public static void main(String[] args) {
        String str="123";
        boolean flag=false;
        flag=palindromeOrNOt(str,0,str.length()-1,flag);
        if(flag) System.out.println("is palindrome");
        else System.out.println("not palindroe");
    }

    private static boolean palindromeOrNOt(String str,int start,int end,boolean flag) {

        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;

            }
            start++;
            end--;
        }
        return true;
    }
}
