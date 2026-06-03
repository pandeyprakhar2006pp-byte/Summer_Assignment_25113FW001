//Recursive Factorial
import java.util.Scanner;
public class RecursiveFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        int num = sc.nextInt();
        
        int result = factorial(num);
        
        System.out.println("The factorial of " + num + " is: " + result);
    }
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * factorial(n - 1); 
    }


}