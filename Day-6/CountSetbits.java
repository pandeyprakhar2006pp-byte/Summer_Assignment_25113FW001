//WAP to count set bits in a number
import java.util.Scanner;
public class CountSetbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count its set bits:");
        int num = sc.nextInt();
        
        int count = countSetBits(num);
        
        System.out.println("The number of set bits in " + num + " is: " + count);
    }
    
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {    
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}   