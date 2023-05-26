import java.util.Scanner;


public class HollowRectangularPattern {

    public static void main(String[] args)
    {
        int rows, columns, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter Number of Rows : ");
        rows = sc.nextInt();

        System.out.print(" Please Enter Number of Columns : ");
        columns = sc.nextInt();

        for(i = 1; i <= rows; i++)
            {for (j=1 ; j <= columns ;j++)

            { if(i==1 || i==rows || j==columns|| j==1)

                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
  }
}
