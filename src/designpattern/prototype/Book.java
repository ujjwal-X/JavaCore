package designpattern.prototype;

public class Book implements Prototype {

    private String book;
    private String author;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String book, String author) {
        this.book = book;
        this.author = author;
    }
    public Book(){

    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            {
                e.printStackTrace();
                return null;
            }
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "book='" + book + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
