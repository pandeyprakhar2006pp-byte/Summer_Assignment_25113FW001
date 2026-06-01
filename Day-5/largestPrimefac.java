//largest prime factor of a number
import java.util.Scanner;
public class largestPrimefac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its largest prime factor:");
        int num = sc.nextInt();
        
        int largestPrimeFactor = findLargestPrimeFactor(num);
        
        if (largestPrimeFactor != -1) {
            System.out.println("The largest prime factor of " + num + " is: " + largestPrimeFactor);
        } else {
            System.out.println(num + " has no prime factors.");
        }
    }
    
    public static int findLargestPrimeFactor(int num) {
        int largestFactor = -1;
        
        // Check for number of 2s that divide num
        while (num % 2 == 0) {
            largestFactor = 2;
            num /= 2;
        }
        
        // num must be odd at this point, so we can skip even numbers
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                largestFactor = i;
                num /= i;
            }
        }
        
        // This condition is to check if num is a prime number greater than 2
        if (num > 2) {
            largestFactor = num;
        }
        
        return largestFactor;
    }
}