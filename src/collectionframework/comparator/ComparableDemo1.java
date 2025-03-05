package collectionframework.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableDemo1 {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        ArrayList<Integer> i=new ArrayList<>();
        i.add(100);
        i.add(50);
        i.add(400);
        i.add(600);
        i.add(8900);
        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

//        al.sort(Comparator.comparing(c->c.name));

        al.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(al);

    }
}
