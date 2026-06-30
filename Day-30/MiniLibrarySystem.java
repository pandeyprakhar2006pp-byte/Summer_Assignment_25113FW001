//WAP to create mini library system
import java.util.Scanner;

public class MiniLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String books[] = {"Java", "Python", "C++"};
        boolean issued[] = {false, false, false};

        System.out.println("1. View Books");
        System.out.println("2. Issue Book");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Available Books:");
            for (int i = 0; i < books.length; i++) {
                if (!issued[i]) {
                    System.out.println((i + 1) + ". " + books[i]);
                }
            }
        } 
        else if (choice == 2) {
            System.out.print("Enter Book Number (1-3): ");
            int bookNo = sc.nextInt();

            if (!issued[bookNo - 1]) {
                issued[bookNo - 1] = true;
                System.out.println("Book Issued Successfully!");
            } else {
                System.out.println("Book Already Issued.");
            }
        } 
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}