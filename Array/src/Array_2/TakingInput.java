package Array_2;
import java.util.Scanner;



public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array elements ");
        for (int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }

        for (int i =0 ; i<n ; i++ ){
            System.out.print(arr[i] +" ");
        }
    }
}
