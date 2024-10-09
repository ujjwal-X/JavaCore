package Doubts;

public class loopNullException {
    public static void main(String[] args) {
        String[] s = {"abc", "123", null, "xyz"};
        for( String sr:s){
            System.out.println(sr);
        }
        for (int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }
}
