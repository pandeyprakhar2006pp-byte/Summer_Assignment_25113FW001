//Write a program to Create student record system using arrays and strings. 
import java.util.Scanner;

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names[] = new String[3];
        int marks[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n--- Student Records ---");

        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + names[i] +
                               ", Marks: " + marks[i]);
        }

        sc.close();
    }
}