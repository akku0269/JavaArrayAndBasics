package Problems3;

import java.util.Scanner;

public class SumOfRectangle {

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int findSum1(int[][] matrix , int l1, int r1 , int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
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

    System.out.println("original array");
    printMatrix(matrix);
    System.out.println();

        System.out.println("Enter l1 , r1 , l2 , r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();


        System.out.println("Rectangle Sum :" + findSum1(matrix , l1 , r1 , l2 , r2 ));
    }
}
