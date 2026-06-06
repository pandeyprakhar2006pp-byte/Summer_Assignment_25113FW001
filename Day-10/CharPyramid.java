//Character pyramid
import java.util.Scanner;
public class CharPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the character pyramid:");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                char ch = (char)(k + 64); // Convert to corresponding uppercase character
                System.out.print(ch);
            }
            for (int k = i - 1; k >= 1; k--) {
                char ch = (char)(k + 64); // Convert to corresponding uppercase character
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}