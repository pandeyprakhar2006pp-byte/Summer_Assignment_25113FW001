//Recursive Fibonacci
import java.util.Scanner;
public class RecursiveFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci terms to display:");
        int n = sc.nextInt();
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; 
        } else if (n == 1) {
            return 1; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }
}