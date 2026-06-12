//Armstrong  number checker by functions
//Armstrong or not
import java.util.Scanner;
import java.util.*;
public class ArmstrongFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int num = sc.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
    public static boolean isArmstrong(int num) {
        int n1,n2,c=0,r;
        double s=0;
        n1=num;
        while(num!=0){
          num=num/10;
            c=c+1;
        }
        n2=n1;
        while(n1!=0){
            r=n1%10;
            s=s+Math.pow(r,c);

            n1=n1/10;
        }
        if(n2==s){
            return true;
        }
        else{
            return false;
        }
    }
}
            