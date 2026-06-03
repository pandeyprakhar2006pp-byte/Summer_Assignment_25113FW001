//Recursive Sum of Digits
import java.util.Scanner;
public class RecursiveSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of its digits:");
        int num = sc.nextInt();
        
        int result = sumOfDigits(num);
        
        System.out.println("The sum of the digits in " + num + " is: " + result);
    }
    
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; 
        }
        return (n % 10) + sumOfDigits(n / 10); 
    }
}