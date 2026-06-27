//Write a program to Create salary management system
import java.util.Scanner;

public class SalaryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        double hra = salary * 0.20;   // 20% HRA
        double da = salary * 0.10;    // 10% DA
        double totalSalary = salary + hra + da;

        System.out.println("\n--- Salary Details ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + salary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + totalSalary);
    }
}