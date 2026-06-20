//WAP to check symmetric matrix
public class CheckSymmetric{
    
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        boolean symmetric = true;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not Symmetric Matrix");
    }
}

