//Reverse number triangle pattern
import java.util.Scanner;
public class RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the reverse number triangle pattern:");
        int rows = sc.nextInt();
        
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}