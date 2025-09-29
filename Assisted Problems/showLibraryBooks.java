import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    void showDetails(){
        System.out.println("Book: " + title + " | Author: " + author);
    }
}

class Library {
    String name;
    List<Book> books;

    Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book){
        books.add(book);
    }

    void showLibraryBooks(){
        System.out.println("\nLibrary: " + name);
        for(Book b : books){
            b.showDetails();
        }
    }
}

public class showLibraryBooks {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Python Crash Course", "Eric Matthes");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);  

        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}
