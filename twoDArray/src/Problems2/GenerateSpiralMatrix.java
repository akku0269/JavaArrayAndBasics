package Problems2;

import java.util.Scanner;

public class GenerateSpiralMatrix {
    
    static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}

    static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0;
        int bottomRow = n - 1;
        int leftCol = 0;
        int rightCol = n - 1;
        int curr = 1;


        while(curr <= n*n)
        {
            for (int j = leftCol; j <= rightCol && curr <= n * n ; j++) {
                matrix[topRow][j] = curr;
                        curr++;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow && curr <= n * n; i++) {
                matrix[i][rightCol] =curr;
                        curr++;
            }
            rightCol--;

            for (int j = rightCol; j >= leftCol && curr <= n * n; j--) {
                matrix[bottomRow][j] =curr;
                        curr++;
            }
            bottomRow--;

            for (int i = bottomRow; i >= topRow && curr <= n * n; i--) {
                matrix[i][leftCol] = curr;
                curr++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");

        int n = sc.nextInt();

        int[][] matrix =generateSpiralMatrix(n);
        printMatrix(matrix);



    }


}


