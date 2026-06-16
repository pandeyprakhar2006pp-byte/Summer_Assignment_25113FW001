//TO find pair with given sum
import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int targetSum = sc.nextInt();
        findPairsWithSum(arr, targetSum);
    }
    public static void findPairsWithSum(int[] arr, int targetSum) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}