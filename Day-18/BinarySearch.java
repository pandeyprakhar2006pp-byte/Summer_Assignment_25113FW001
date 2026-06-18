//Binary Search
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (sorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();
        
        int result = binarySearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
    public static int binarySearch(int[] arr, int target) {
        int beg=0;
        int end=arr.length-1;
        while(beg<=end){
            int mid=(beg+end)/2;
            if(arr[mid]==target){
                return mid;
            }
        
            if(target<arr[mid]){
                end=mid-1;
            }
               else{
                beg=mid+1;
               }
            }
            return -1;
        }
}