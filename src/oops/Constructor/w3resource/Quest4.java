package oops.Constructor.w3resource;
//Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. Implement a
// default constructor and a parameterized constructor that takes all three instance variables. Use constructor chaining to
// initialize the variables. Print the values of the variables.
class Student{
    private int studentId;
    private String studentName;
    private String grade;
    Student(){
        this(0,null,null);
    }
    Student(int studentId,String studentName,String grade){

        this.studentId=studentId;
        this.studentName=studentName;
        this.grade=grade;
        System.out.println(studentId+" "+studentName+" "+grade);

    }
}
public class Quest4 {
    public static void main(String[] args) {

        Student s1=new Student();
        Student student2 = new Student(101, "Cullen", "A");

    }
}
