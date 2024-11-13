package oops.Constructor.w3resource;
import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and
// remove books from a collection.
class Books{
    String title;
    String author;
    String isbn;
    public  static ArrayList<Books> a=new ArrayList<>();

    Books(){

    }
    Books(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    void add(Books b){
        a.add(b);
    }
    void remove(Books b){
        a.remove(b);
    }

    @Override
    public String toString() {
        String s = "";
        for (Books b:a){
            s+= b.title+"   "+b.isbn+"   "+b.author+"\n";
        }
        return s;
    }
}
public class Quest5 {
    public static void main(String[] args) {

        Books b=new Books();
        Books b1=new Books("Java Programming", "John Doe", "12345");
        Books b2= new Books("Data Structures", "Jane Smith", "67890");
        Books b3=new Books("Algorithms", "Mark Twain", "11223");

        b.add(b1);
        b.add(b2);
        b.add(b3);
        System.out.println(b);
        b.remove(b3);
        System.out.println(b);




    }
}
