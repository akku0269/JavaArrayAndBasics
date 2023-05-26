import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Princple:");
        float p = sc.nextFloat();

        System.out.println("Enter Rate of Intrest:");
        float r = sc.nextFloat();

        System.out.println("Enter time:");
        float t = sc.nextFloat();

        float si =(p*r*t)/100;

        System.out.println("Principle :" +p);
        System.out.println("rate of intrest :" +r);
        System.out.println("time :" +t);

        System.out.println("simple intrest:" +si);

    }
}
