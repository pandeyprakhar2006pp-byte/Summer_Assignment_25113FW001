//Factorial by function
import java.util.Scanner;
public class FactFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int num = sc.nextInt();
        
        int factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static int calculateFactorial(int n) {
        int fact =1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}