package Problems1;

import java.util.Scanner;

public class RotateBy90{
    static void transposeInPlace(int[][] matrix , int r , int c)
    {
        for (int i = 0 ; i<c ; i++){
            for (int j = i ; j<r ; j++){
                int temp = matrix[i][j] ;
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reverseArray(int[] arr ) {
            int i = 0;
            int j = arr.length - 1;
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        static void rotate(int[][] matrix, int n){
        transposeInPlace(matrix,n,n);
        for(int i = 0 ; i < n ; i++){
            reverseArray(matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int r = sc.nextInt();
        System.out.println("Enter no. of coloumns");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter " + r*c + " elements");

        for(int i = 0 ; i< matrix.length ; i++){

            for(int j = 0 ; j<matrix[i].length ; j++){

                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("Input matrix");
        printMatrix(matrix);

        rotate(matrix,r);
        System.out.println("Transpose matrix");
        printMatrix(matrix);
    }
}
