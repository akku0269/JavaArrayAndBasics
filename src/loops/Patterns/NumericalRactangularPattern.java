package loops.Patterns;

import java.util.Scanner;

public class NumericalRactangularPattern {
    public static void main(String[] args) {

        int r,i,j,k;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of Rows = ");
        r = sc.nextInt();


            for(i=1 ; i <=r ; i++)
            {
                for(j=i ; j<= r ; j++){
                System.out.print(j);
        }
           for(k=1 ; k<=i-1 ; k++){
                System.out.print(k);
      }
                System.out.println();
     }
    }
   }

