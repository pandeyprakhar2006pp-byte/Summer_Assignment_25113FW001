//WAP to check if a number is a strong number
import java.util.Scanner;
public class Strongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a strong number:");
        int num = sc.nextInt();
        
        if (isStrong(num)) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
    }
    
    public static boolean isStrong(int num) {
        int sum = 0, originalNum = num;
        
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        
        return sum == originalNum;
    }
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}