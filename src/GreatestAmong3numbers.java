import java.util.Scanner;

public class GreatestAmong3numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter 1st no. : ");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd no. : ");
        num2 = sc.nextInt();
        System.out.println("Enter 3rd no. : ");
        num3 = sc.nextInt();

        if(num1>num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is greater");
            } else {
                System.out.println(num3 + " is greater");
            }
        }
        else
        {
            if(num2>num3)
            {
            System.out.println(num2 + " is greater");
            }
            else
            {
                System.out.println(num3 + " is greater");
            }
            }

    }
}