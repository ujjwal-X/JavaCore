package oops.Constructor.w3resource;
//Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default constructor
// that initializes the name to "Unknown" and the age to 0. Print the values of the variables.

class Cat{
    int age;
    String name;
    Cat(){
        age=0;
        name="Unknown";
    }
}
public class Quest1 {
    public static void main(String[] args) {
        Cat c=new Cat();
        System.out.println(c.age+" "+c.name);

    }
}
