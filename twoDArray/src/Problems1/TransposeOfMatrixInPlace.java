package Problems1;

import java.util.Scanner;

public class TransposeOfMatrixInPlace {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transposeInPlace(int[][] matrix , int r , int c){

        for (int i = 0 ; i<c ; i++){
            for (int j = i ; j<r ; j++){
                int temp = matrix[i][j] ;
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int r = sc.nextInt();
        System.out.println("Enter no. of coloumns");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter " + r*c + " elements");

        for(int i = 0 ; i< arr.length ; i++){

            for(int j = 0 ; j<arr[i].length ; j++){

                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("Input matrix");
        printMatrix(arr);

        transposeInPlace(arr ,r,c);
        System.out.println("Transpose matrix");
        printMatrix(arr);
    }
}
