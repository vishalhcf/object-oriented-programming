class Book {
    public String ISBN;        // Public
    protected String title;    // Protected
    private String author;     // Private

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public methods to access/modify private author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass demonstrating access to public + protected
class EBook extends Book {
    private double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title +  // public + protected
                ", Author: " + getAuthor() + ", File Size: " + fileSize + "MB");
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-12345", "Java Basics", "John Doe", 5.2);
        ebook.displayBookDetails();
        ebook.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
