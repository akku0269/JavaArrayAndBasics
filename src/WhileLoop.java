import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int Sum = 0;

        int num = 1;

                while(num <= n){
                    System.out.println(num);
                    Sum= Sum+num;
                    num++;
                    }
    }
}
