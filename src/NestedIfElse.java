import java.util.Scanner;

public class NestedIfElse {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age<=12) {
            if (age < 5) {
                System.out.println("bachha");
            } else {
                System.out.println("child");
            }
        }
        else if (age > 12 && age < 20){
            System.out.println("teenager");}
        else{
            System.out.println("adult");
        }
    }
}
