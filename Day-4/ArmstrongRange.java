//Armstrong numbers in a range
import java.util.Scanner;
public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit of the range:");
        int lower = sc.nextInt();
        System.out.println("Enter the upper limit of the range:");
        int upper = sc.nextInt();
        
        System.out.println("Armstrong numbers between " + lower + " and " + upper + ":");
        for (int i = lower; i <= upper; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean isArmstrong(int num) {
        int n1, n2, c = 0, r;
        double s = 0;
        n1 = num;
        while (num != 0) {
            num = num / 10;
            c = c + 1;
        }
        n2 = n1;
        while (n1 != 0) {
            r = n1 % 10;
            s = s + Math.pow(r, c);
            n1 = n1 / 10;
        }
    if (n2 == s) {
            return true;
        } else {
            return false;
        }
    }
}