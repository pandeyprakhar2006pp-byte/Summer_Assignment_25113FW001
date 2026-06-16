//Missing number in an array

public class MissNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5}; // Example array with a missing number
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Total numbers should be length of array + 1
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0;
        
        for (int num : arr) {
            arraySum += num; // Sum of elements in the array
        }
        
        return totalSum - arraySum; // The difference is the missing number
    }
}