package ProblemsInArray1;

import java.util.Arrays;
import java.util.Scanner;

public class A4 {

    static int[] Secondlargest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int[] ans = {arr[n-2]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Array elements ");
        for (int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
       // System.out.println(Secondlargest(arr));
        int[] ans = Secondlargest(arr);
        System.out.println("2nd largest : " +ans[0]);

    }
}
