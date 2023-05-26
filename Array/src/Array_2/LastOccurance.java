package Array_2;
import java.util.Scanner;

public class LastOccurance {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,6,4,2,9,2,6};
        int index = 0 ;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0 ; i<arr.length ; i++){
            if (arr[i] == x ){
                index = i;
            }
        }
        System.out.println("last occurrence "+ index);
    }
}
