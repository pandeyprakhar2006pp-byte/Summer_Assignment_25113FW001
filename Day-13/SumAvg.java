//Sum and average of elements of an array
import java.util.Scanner;
public class SumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        
        double average = (double) sum / size;
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}
