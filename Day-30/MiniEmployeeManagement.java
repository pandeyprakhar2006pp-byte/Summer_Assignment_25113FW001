//WAP to create a mini employee management system
import java.util.Scanner;

public class MiniEmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String empNames[] = new String[3];
        double salaries[] = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Employee Name: ");
            empNames[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salaries[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\n--- Employee Records ---");

        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + empNames[i] +
                               ", Salary: " + salaries[i]);
        }

        sc.close();
    }
}