//To find Frequency of an element in an array
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to find its frequency:");
        int target = sc.nextInt();
        
        int frequency = findFrequency(arr, target);
        
        System.out.println("The frequency of " + target + " in the array is: " + frequency);
    }
    
    public static int findFrequency(int[] arr, int target) {
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}