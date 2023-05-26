package loops.Patterns;
import java.util.Scanner;
public class HollowTP {
    /*public static void main(String[] args)
    {
        int i,j,r,c , k;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the no. of rows:");
        r = sc.nextInt();

        System.out.print(" Please Enter Number of Columns : ");
        c = sc.nextInt();




        for (i=1 ; i<=r ; i++){
           for (j=1 ; j<=r-i ;j++)

               System.out.print(" ");
            for(k= 1; k <= c; k++) {
           if (i==1 || i==r || k==c || k==1)
               System.out.print(i);
           else
               System.out.print(" ");}

            System.out.println();
        }
    }
}*/


    public static void main(String[] args) {
        int i, j, k,rows;
        Scanner sc = new Scanner(System.in);
        rows=sc.nextInt();
        for(i = rows+1; i >1 ; i--)
        {
            for(j = i; j > 2; j--)
            {
                System.out.print(" ");
            }
            for( k=1;k<=(rows-i+1);k++){
                if(k==1){ System.out.print(rows-i+2);}
                else{ System.out.print(" ");}
            }
            for(int m=k;m>=1;m--){
                if(m==1){ System.out.print(rows-i+2);}
                else{ System.out.print(" ");}
            }
            System.out.println("");
        }

    }
}