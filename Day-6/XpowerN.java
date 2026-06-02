//x^n without pow()
import java.util.Scanner;
public class XpowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number (x):");
        int x = sc.nextInt();
        System.out.println("Enter the exponent (n):");
        int n = sc.nextInt();
        
        int result = power(x, n);
        
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
    
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; 
        }
        return base * power(base, exponent - 1); 
    }
}



// Method 2:Normal loop run 
// import java.util.Scanner;
// public class XpowerN {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the base number (x):");
//         int x = sc.nextInt();
//         System.out.println("Enter the exponent (n):");
//         int n = sc.nextInt();
        
//         int result = power(x, n);
        
//         System.out.println(x + " raised to the power of " + n + " is: " + result);
//     }
    
//     public static int power(int base, int exponent) {
//         int result = 1;
//         for (int i = 0; i < exponent; i++) {
//             result *= base;
//         }
//         return result;
//     }
// }