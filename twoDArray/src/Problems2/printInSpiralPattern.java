package Problems2;

import java.util.Scanner;

public class printInSpiralPattern {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void SpiralOrder(int[][] matrix , int r , int c){
        int topRow = 0 ; int bottomRow = r-1 ; int leftCol = 0 ; int rightCol = c-1;
        int totalElements = 0;
        int[][] ans = new int[r][c];

        while(totalElements < r*c) {
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow  && totalElements < r * c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            for(int j = rightCol ; j >= leftCol && totalElements < r*c ; j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            for(int i = bottomRow ; i >=topRow && totalElements < r*c ; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;


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

        System.out.println("spiral matrix");
        SpiralOrder(matrix,r,c);
        
    }


}
