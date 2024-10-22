package learningclassandobject;

class Students{
    private  int roll;
    private String name;
   public String course;
   Students(){
       System.out.println("constructor is called");
   }
   void setRoll(int x){
       this.roll=x;

   }
   int  getRoll(){
       return  roll;
   }
   void setName(String x){
       this.name=x;

   }
    String details(){
        return "Roll number is "+roll+" Name is "+name+" Present in "+course+" Course";
    }
}
public class DataHiding {
    public static void main(String[] args) {
Students s1=new Students();
        s1.setRoll(112);
        s1.setName("anuj");
        s1.course="Java";
        System.out.println(s1.details());
        System.out.println(s1.getRoll());

    }
}
