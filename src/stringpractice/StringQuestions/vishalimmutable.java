package stringpractice.StringQuestions;

final class Person{
   private int person_id;

   Person(int person_id){
       this.person_id=person_id;
   }

   public int getPerson_id(){
       return person_id;
   }
}

public class vishalimmutable {
    public static void main(String[] args) {
        Person p=new Person(10);
        System.out.println( p.getPerson_id());
    }

}
