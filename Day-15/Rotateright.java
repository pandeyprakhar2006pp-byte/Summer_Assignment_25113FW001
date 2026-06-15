//TO rotate an array to right by k times
import java.util.*;
public class Rotateright {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of positions to rotate right:");
        int k = sc.nextInt();
        rotateRight(arr, k);
    }
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        reverse(arr, 0, n - 1); 
        reverse(arr, 0, k - 1); 
        reverse(arr, k, n - 1); 
        System.out.println("Array after right rotation:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}