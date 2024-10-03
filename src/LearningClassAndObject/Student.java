package LearningClassAndObject;
class  StudentClass {
    int roll;
    String name;
    String course;
    int sub1, sub2, sub3;
    String details(){
        return "Roll number is "+roll+" Name is "+name+" Present in "+course+" Course";
    }
    double total() {
        return sub1 + sub2 + sub3;
    }

    double average() {
        return (double) (sub1 + sub2 + sub3) / 3;
    }

    char grade() {
        if (total() > 200) {
            return 'A';
        }
        else if(total() < 220 && total()>170){
            return 'B';
        }
        else if(total() < 170 && total()>100){
            return 'C';
        }
        else  return 'D';
    }
}


public class Student {
    public static void main(String[] args) {
        StudentClass s1 = new StudentClass();
        s1.name = "Anuj";
        s1.course = "Java";
        s1.sub1 = 70;
        s1.sub2 = 80;
        s1.sub3 = 90;
        s1.roll=112;
        System.out.println(s1.total());
        System.out.println(s1.average());
        System.out.println(s1.grade());
        System.out.println(s1.details());
    }
}
