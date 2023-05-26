package loops.Patterns;

import java.util.Scanner;

public class NumericalTriamgularpattern {
    public static void main(String[] args)
    {

        int rows, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter Number of Rows : ");
        rows = sc.nextInt();


        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {

                System.out.print(j);

            }
            System.out.println();
        }
    }
}