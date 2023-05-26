package ProblemsInArray4;

import java.util.Scanner;

public class PartitionIntoSubArray {

    static int FindArraysum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean EqualSumPartion(int[] arr) {
        int n = arr.length;
        int totalSum = FindArraysum(arr);
        int prefSum = 0;
        for (int i = 0; i < n; i++) {
            prefSum += arr[i];
            int suffSum = totalSum - prefSum;
            if (suffSum == prefSum) {
                return true;
            }
        }
    return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }


        System.out.println("Equal Sum Partition Possible: " + EqualSumPartion(arr));

    }
}
