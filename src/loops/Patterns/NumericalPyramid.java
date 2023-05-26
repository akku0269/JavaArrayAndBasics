package loops.Patterns;

import java.util.Scanner;

public class NumericalPyramid {

 public static void main(String[] args) {
     int rows, p, k;

     Scanner sc = new Scanner(System.in);

     System.out.print(" Please Enter Number of Rows : ");
     rows = sc.nextInt();


     int i;
     for (i = 1; i <= rows; i++) {
         for (int space = 1; space >= rows - i; space++) {
             System.out.print("  ");
         }
         for (p = 1; p <= i; p++) {
             System.out.print(p);
         }


     for (k = i - 1; k >= 1; k--) {
         System.out.print(k);

     }

     System.out.println();
 }
}}

