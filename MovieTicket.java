import java.util.Scanner;

public class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    public void displayBill(double discount, double finalAmount) {
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: %.2f\n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("Final Amount: %.2f\n", finalAmount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();
        System.out.print("Enter ticket price: ");
        double ticketPrice = sc.nextDouble();
        System.out.print("Enter number of tickets: ");
        int numberOfTickets = sc.nextInt();

        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);

        double discount = ticket.calculateDiscount();
        double finalAmount = ticket.calculateFinalAmount();

        ticket.displayBill(discount, finalAmount);

        sc.close();
    }
}