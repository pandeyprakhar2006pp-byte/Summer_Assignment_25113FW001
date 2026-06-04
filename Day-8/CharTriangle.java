//Print character-triangle pattern
import java.util.Scanner;
public class CharTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the character triangle:");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++) {
                char ch = (char)(j + 64); // ASCII value of 'A' is 65, so we add 64 to get the corresponding character
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}