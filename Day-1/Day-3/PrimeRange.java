//Prime numbers in a range
import java.util.Scanner;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        int lower = sc.nextInt();
        System.out.println("Enter the upper limit:");
        int upper = sc.nextInt();
        
        System.out.println("Prime numbers between " + lower + " and " + upper + ":");
        
        for (int num = lower; num <= upper; num++) {
            boolean isPrime = true;
            
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
