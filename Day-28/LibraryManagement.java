//Write a program to create library management system

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        System.out.println("1. Issue Book");
        System.out.println("2. Return Book");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println(book + " Issued Successfully.");
        } else if (choice == 2) {
            System.out.println(book + " Returned Successfully.");
        } else {
            System.out.println("Invalid Choice");
        }
    }
}