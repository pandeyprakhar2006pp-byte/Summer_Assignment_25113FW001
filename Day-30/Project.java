//WAP to develop complete mini project using arrays,strings and functions.

//----------------------------------------Student Management System----------------------------------------------------
import java.util.Scanner;

public class Project {

    static String[] names = new String[100];
    static int[] marks = new int[100];
    static int count = 0;

    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter Student Name: ");
        names[count] = sc.next();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();

        count++;
        System.out.println("Student Added Successfully.");
    }

    public static void displayStudents() {
        if (count == 0) {
            System.out.println("No Records Found.");
            return;
        }

        System.out.println("\nStudent Records");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + marks[i]);
        }
    }

    public static void searchStudent() {
        System.out.print("Enter Student Name: ");
        String name = sc.next();

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                System.out.println("Student Found");
                System.out.println("Name: " + names[i]);
                System.out.println("Marks: " + marks[i]);
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void updateStudent() {
        System.out.print("Enter Student Name to Update: ");
        String name = sc.next();

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(name)) {

                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextInt();

                System.out.println("Record Updated Successfully.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void deleteStudent() {
        System.out.print("Enter Student Name to Delete: ");
        String name = sc.next();

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(name)) {

                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j + 1];
                    marks[j] = marks[j + 1];
                }

                count--;
                System.out.println("Record Deleted Successfully.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}