//WAP to find string length without strlen()
import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int count = 0;
        for (char ch : arr) {
            count++;
        }

        System.out.println("Length = " + count);
    }
}

    
