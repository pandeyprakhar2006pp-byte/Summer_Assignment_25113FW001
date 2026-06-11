//Maximum number among 3 numbers using functions
import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();
        
        int max = findMax(num1, num2, num3);
        
        System.out.println("The maximum number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + max);
    }
    
    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}