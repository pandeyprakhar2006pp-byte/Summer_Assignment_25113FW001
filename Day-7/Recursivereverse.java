//Recursive Reverse number by usuing recursion
import java.util.Scanner;
public class Recursivereverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int num = sc.nextInt();
        
        int result = reverseNumber(num, 0);
        
        System.out.println("The reverse of " + num + " is: " + result);
    }
    
    public static int reverseNumber(int n, int rev) {
        if (n == 0) {
            return rev; 
        }
        rev = rev * 10 + n % 10; 
        return reverseNumber(n / 10, rev); 
    }
}
  