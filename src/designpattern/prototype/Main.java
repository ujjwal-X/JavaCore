package designpattern.prototype;

public class Main {
    public static void main(String[] args) {
        Book originalBook = new Book("Design Patterns", "Gamma et al.");
        System.out.println("Original: " + originalBook);

        // Clone the book
        Book clonedBook = (Book) originalBook.clone();
        clonedBook.setAuthor("Effective Java");
        System.out.println("Cloned: " + clonedBook);

        // Original remains unchanged
        System.out.println("Original after cloning: " + originalBook);
    }
}
