package StringPractice.StringQuestions;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str="Coding ninja";
        String dupilcate="";
        System.out.println(String.valueOf(str.charAt(2)));
//        for(int i=0;i<str.length();i++){
//            for(int j=i+1; j<str.length();j++){
//                if(str.charAt(i)==str.charAt(j) && !dupilcate.contains(String.valueOf(str.charAt(i)))){
//                    dupilcate+=str.charAt(i);
//                }
//            }
//
//        }
        System.out.println(dupilcate);
    }
}
