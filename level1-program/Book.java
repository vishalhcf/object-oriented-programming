public class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Creating a Book object
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 299.99);

        // Displaying the details of the book
        book.displayDetails();
    }
}