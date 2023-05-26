package ProblemInArray2;

import java.util.Scanner;

public class RotateKtimes {

        static int[] Rotate ( int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i <n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter K");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();;
        int[] arr = {1, 2, 3, 4, 5,6,7,8};
        int[] ans = Rotate(arr, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

//  public static void rotate(int[] a, int k) {
//        int n = a.length;
//        k %= n; // k can be greater than n
//        int[] ans = new int[n];
//
//        for (int i = n - k; i <= n - 1; i++){
//            ans[i - (n - k)] = a[i];
//        }
//        for (int i = 0; i < n - k; i++) {
//            ans[i + k] = a[i];
//        }
//        for (int i = 0; i < n; i++) {
//            a[i] = ans[i];
//        }
//    }

//    public static void main(String[] args){
//        int a[]={1,2,3,4,5};
//
//        System.out.println("Original array ");
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.print(a[i]+" ");
//        }
//
//        System.out.println(" ");
//        int k=2;
//        Rotate(a,k);
//        System.out.println("Rotated array ");
//
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.print(a[i] + " ");
//        }
//    }
//}
