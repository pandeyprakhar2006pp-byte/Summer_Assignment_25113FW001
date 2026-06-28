//WAP to create a ticket booking system
import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------Welcome!------------------");

        int price = 200;
        System.out.println("Price of ticket concert is: " +price);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of tickets to be booked: ");
        int tickets = sc.nextInt();

        int totalAmount = tickets * price;

        System.out.print("\nCongratulations!! Your booking has been successful");
        System.out.println("\n--- Booking Details ---");
        System.out.println("Name: " + name);
        System.out.println("Tickets: " + tickets);
        System.out.println("Total Amount: " + totalAmount);

      
    }
}