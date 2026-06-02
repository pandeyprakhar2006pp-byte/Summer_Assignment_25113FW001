//Binary to Decimal number conversion
import java.util.Scanner;
public class BintoDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int binaryNum = sc.nextInt();
  
        bintodec(binaryNum);
}
    public static void bintodec(int binaryNum) {
        int myNum = binaryNum;
        int decimalNum = 0;
        int power = 0;
        
        while (binaryNum > 0) {
            int lastDigit = binaryNum % 10;
            decimalNum += lastDigit * Math.pow(2, power);
            binaryNum /= 10;
            power++;
        }
        
        System.out.println("The decimal equivalent of " + myNum + " is: " + decimalNum);
    }
}