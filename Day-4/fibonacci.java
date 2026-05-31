//FIBONACCI SERIES
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series:");
        int n = sc.nextInt();
        int a=0,b=1;
        System.out.println("Fibonacci series up to " + n + " terms:");
        System.out.print(a + " " + b + " ");
        for(int i=1; i<=n-2; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

        
    }
       
}
