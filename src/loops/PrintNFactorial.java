package loops;

import java.util.Scanner;


public class PrintNFactorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

        for( int i=1 ; i <= n ; i++ ){
            fact = fact * i;

       if(i==n)
       {
           System.out.println("Factorial of " + i + ":" + fact);
       }



    }
}}
