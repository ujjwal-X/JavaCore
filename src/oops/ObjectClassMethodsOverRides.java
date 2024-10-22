package oops;
class A{
    int a=10;

//    public boolean equals(A obj) {
//        if(obj==this) {return true;}
//        return true;
//    }


//Using instanceof
//    public boolean equals(A a) {
//        if ((a instanceof A)) {
//            return true;
//        }
//        return true;
//    }



//    public void equals(A a) {
//        System.out.println(a.hashCode());
//    }
}
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class ObjectClassMethodsOverRides {
    public static void main(String[] args) {
        A a=new A();
        A a1=new A();
        String str="Ujjwal";
        String str1="Ujjwal";
        str1=str1.concat("Check");
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 25);
        Person person3=person1;
        System.out.println(person1==person2);//false
        System.out.println(person1.equals(person2));//false
        System.out.println(person1.name==person2.name);//true
        System.out.println(person1==person3);//true
        System.out.println(person1.equals(person3));//true
        System.out.println(person1.name.equals(person2.name));//false


//        System.out.println(str==str1);
//        System.out.println(str.equals(str1));
//        System.out.println(a1==a);
//        System.out.println(a.equals(a1));
//        System.out.println(a.equals(a));

    }
}
