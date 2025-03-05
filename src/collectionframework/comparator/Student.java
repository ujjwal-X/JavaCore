package collectionframework.comparator;

public class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public int compareTo(Student st){
        if(name==st.name)
            return 0;
        else if(name.charAt(0)>st.name.charAt(0))
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


