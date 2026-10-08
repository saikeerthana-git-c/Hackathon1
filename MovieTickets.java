import java.util.Scanner;

class MovieTickets {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    // Parameterized constructor
    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Calculate total amount
    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    // Calculate discount
    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        } else {
            return 0;
        }
    }

    // Calculate final amount
    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    // Display bill
    void displayBill() {
        System.out.println("\n----- Cinema Ticket Bill -----");
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Discount: %.2f%n", calculateDiscount());
        System.out.printf("Final Amount: %.2f%n", calculateFinalAmount());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter number of tickets: ");
        int numberOfTickets = sc.nextInt();

        // Create object using constructor
        MovieTicket movie = new MovieTicket(movieName, ticketPrice, numberOfTickets);

        // Display bill
        movie.displayBill();

        sc.close();
    }
}