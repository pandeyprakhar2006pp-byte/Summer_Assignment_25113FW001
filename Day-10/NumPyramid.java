//Number pyramid
import java.util.Scanner;
public class NumPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the number pyramid:");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int k= i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
