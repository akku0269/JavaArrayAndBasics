package ProblemsInArray4;

import java.util.Scanner;

public class RangeQuery {

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n+1];

        System.out.println("Enter Array elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }


        System.out.println("input array");
        printArray(arr);
        System.out.println();


        int[] prefSum = makePrefixSumArray(arr);
        System.out.println("Enter no. of Queries");
        int q = sc.nextInt();

        System.out.println("Enter Range");
        while (q--> 0 ){
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l-1];
            System.out.println("Sum" + ans);
        }

    }
}