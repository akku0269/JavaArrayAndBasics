package loops.Patterns;

import java.util.Scanner;

public class Pyramid {


    public static void main(String[] args) {
        int rows, k ;

        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter Number of Rows : ");
        rows = sc.nextInt();


        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }

            for(k=1 ;k <= 2 * i - 1 ;k++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }
}