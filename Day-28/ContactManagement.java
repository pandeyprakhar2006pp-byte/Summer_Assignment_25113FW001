//WAP to create contact management system
import java.util.Scanner;

public class ContactManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add Contact");
        System.out.println("2. View Contact");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            System.out.println("Contact Saved Successfully!");
        } 
        else if (choice == 2) {
            System.out.println("No Contact Available");
        } 
        else {
            System.out.println("Invalid Choice");
        }

     
    }
}