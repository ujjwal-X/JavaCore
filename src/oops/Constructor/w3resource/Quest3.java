package oops.Constructor.w3resource;
//Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a
// default constructor and two parameterized constructors:
//One constructor takes title and author as parameters.
//The other constructor takes title, author, and price as parameters.
//Print the values of the variables for each constructor.

class Book{
    String title;
    String author;
    double price;
    Book(){
        System.out.println(title+" "+author+" "+price);
    }
    Book(String title,String author){
        this.title=title;
        this.author=author;
        System.out.println(title+" "+author);
    }
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
        System.out.println(title+" "+author+" "+price);
    }

    @Override
    public String toString() {
        return title+" "+author+" "+price;
    }
}
public class Quest3 {
    public static void main(String[] args) {
        Book b1=new Book("Java","James Gosling");
        Book b=new Book("Java","James Gosling",12000);
    }
}
