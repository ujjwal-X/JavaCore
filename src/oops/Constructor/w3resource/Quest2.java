package oops.Constructor.w3resource;
//Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized
// constructor that takes name and color as parameters and initializes the instance variables. Print the values of the
// variables.

class Dog{
    String name;
    String color;
    Dog(String name,String color){
        this.name=name;
        this.color=color;
    }
}
public class Quest2 {
    public static void main(String[] args) {
        Dog d=new Dog("Tommy","Brown");
        System.out.println(d.name+" "+d.color);
    }
}
