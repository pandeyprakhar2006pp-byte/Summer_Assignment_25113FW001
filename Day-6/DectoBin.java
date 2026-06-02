//Decimal to Binary number conversion
import java.util.Scanner;
public class DectoBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimalNum = sc.nextInt();
  
        dectobin(decimalNum);
}
    public static void dectobin(int decimalNum) {
        int myNum = decimalNum;
        int binaryNum = 0;
        int power =0;
        while (decimalNum > 0) {
            int rem= decimalNum % 2;
            binaryNum += rem * Math.pow(10, power);
            decimalNum /= 2;
            power++;
        }
        System.out.println("The binary equivalent of " + myNum + " is: " + binaryNum);
    }

}