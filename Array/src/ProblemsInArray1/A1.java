package ProblemsInArray1;

import java.util.Scanner;

public class A1 {
   static int sumof2no(int[] arr , int target) {
       int n = arr.length;
       int ans = 0;
       for (int i = 0; i < n; i++) {
           for (int j = i + 1; j < n; j++) {
               if (arr[i] + arr[j] == target) {
                   ans++;

               }
           }
       }
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
        System.out.println("x");
         int target = sc.nextInt();
        System.out.println(sumof2no(arr, target));

        }
    }
