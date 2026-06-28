//WAP to create bank account system
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        double accountnumber = sc.nextDouble();


        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Balance = " + balance);
        }
        else if (choice == 2) {
            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();
            balance += amount;
            System.out.println("Updated Balance = " + balance);
        }
        else if (choice == 3) {
            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();

            if (amount <= balance) {
                balance -= amount;
                System.out.println("Updated Balance = " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}