//Pallindrome number check by functions
import java.util.Scanner;
public class PallindromeFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a palindrome:");
        int num = sc.nextInt();
        
        boolean isPalindrome = checkPalindrome(num);
        
        if (isPalindrome) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
    
    public static boolean checkPalindrome(int n) {
        int originalNum = n;
        int reversedNum = 0;
        
        while (n > 0) {
            int digit = n % 10; 
            reversedNum = reversedNum * 10 + digit; 
            n /= 10; 
        }
        
        if (originalNum == reversedNum) {
            return true; 
        } else {
            return false; 
        }
    }
}
