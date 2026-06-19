//Wap to subtract matrices
import java.util.Scanner;
public class MatrixSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix A:");
        int rowsA = sc.nextInt();
        System.out.println("Enter the number of columns of matrix A:");
        int colsA = sc.nextInt();
        System.out.println("Enter the number of rows of matrix B:");
        int rowsB = sc.nextInt();
        System.out.println("Enter the number of columns of matrix B:");
        int colsB = sc.nextInt();
        
        if (rowsA != rowsB || colsA != colsB) {
            System.out.println("Incompatible matrix dimensions so addition cannot be performed.");
            return;
        }
        
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        
        int[][] resultMatrix = subtractMatrices(matrixA, matrixB);
        
        System.out.println("Result of Matrix Subtraction:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] resultMatrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        
        return resultMatrix;
    }
}