package Arrays;

import java.util.Scanner;

public class SquareMatrixMultiplication {
    public static void main(String args[]) {
        System.out.println("Enter the number of rows and columns of both matrix.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int matrix1[][] = new int[n][n];
        int matrix2[][] = new int[n][n];
        int resultMatrix[][] = new int[n][n];

        System.out.println("Enter the " + n*n + " elements of matrix 1.");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the " + n*n + " elements of matrix 2.");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                resultMatrix[i][j] = 0;
                for(int k=0; k<n; k++) {
                    resultMatrix[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
        }
    }
}
