//Perfect number check by functions
import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a perfect number:");
        int num = sc.nextInt();
        
        boolean isPerfect = checkPerfect(num);
        
        if (isPerfect) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
    
    public static boolean checkPerfect(int n) {
        int sum = 0;
        
        for (int i = 1; i < n; i++) {
            if (n % i == 0) { 
                sum += i; 
            }
        }
        
        if (sum == n) {
            return true; 
        } else {
            return false; 
        }
    }
}