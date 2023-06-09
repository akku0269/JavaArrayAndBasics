package Problems1;

import java.util.Scanner;

public class TranseposeOfMatrix {
    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] arr , int r , int c){
        int[][] ans = new int[c][r];
        for (int i = 0 ; i<c ; i++){
            for (int j = 0 ; j<r ; j++){
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
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

        transpose(arr ,r,c);
        System.out.println("Transpose matrix");
        int[][] ans = transpose(arr , r,c);
        printMatrix(ans);
    }
}


