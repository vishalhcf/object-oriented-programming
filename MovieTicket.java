public class MovieTicket {
    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", "A10", 300.0);
        ticket.displayDetails();
        ticket.bookTicket("B15", 350.0);
        ticket.displayDetails();
    }
}