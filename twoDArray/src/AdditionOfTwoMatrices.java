import java.util.Scanner;



public class AdditionOfTwoMatrices {


    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addition(int[][] arr1, int[][] arr2, int r1, int c1, int r2, int c2) {
        if ((r1 != r2) || (c1 != c2)) {
            System.out.println("Addition not possible - Wrong dimensions");
            return;
        }

        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {

                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        printMatrix(sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter no. of columns matrix 1");
        int c1 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];

        System.out.println("Enter " + r1 * c1 + " elements");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {

                arr1[i][j] = sc.nextInt();

            }
        }

        System.out.println("Enter no. of rows matrix 2");
        int r2 = sc.nextInt();
        System.out.println("Enter no. of columns matrix 2");
        int c2 = sc.nextInt();

        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter " + r2 * c2 + " elements");

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {

                arr2[i][j] = sc.nextInt();

            }
        }
        System.out.println("Matrix 1");
        printMatrix(arr1);
        System.out.println("Matrix 2");
        printMatrix(arr2);

        System.out.println();

        addition(arr1 , arr2 , r1 , c1 , r2 , c2);
    }
}