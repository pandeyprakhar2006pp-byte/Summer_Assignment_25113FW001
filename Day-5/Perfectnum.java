//Perfect number
import java.util.Scanner;
public class Perfectnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a perfect number:");
        int num = sc.nextInt();
        
        if (isPerfect(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
    
    public static boolean isPerfect(int num) {

        int sum = 0,originalNum = num;
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        if (sum == originalNum) {
            return true;
        } else {
            return false;
        }
    }
}