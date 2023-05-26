package Array_2;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargest{
     static int[] smallest(int[] arr) {
         Arrays.sort(arr);
         int[] ans = {arr[0], arr[arr.length - 1]};
         return ans;
     }
         public static void main (String[]args){
             System.out.println("Enter size of array");
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();

             int[] arr = new int[n];

             System.out.println("Enter Array elements ");
             for (int i = 0; i < n; i++) {
                 arr[i] = sc.nextInt();
             }

        int[] ans = smallest(arr);
             System.out.println("smallest no : " +ans[0]);
             System.out.println("largest no. : " +ans[1]);
         }
}

