//Repeated character triangle pattern
import java.util.Scanner;
public class RepeatChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the repeated character triangle pattern:");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            char ch = (char)(i+64); // Convert to corresponding uppercase character (A=65, B=66, ...)
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}