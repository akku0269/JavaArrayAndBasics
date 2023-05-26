package ProblemsInArray3;

import java.util.Scanner;

public class SortByParity {  // even pehle print honge odd badme
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void sortByParity(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] %2 ==1 && arr[right] %2 ==0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] %2== 0) {
                left++;
            }
            if (arr[right] %2== 1) {
                right--;
            }
        }
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


        System.out.println("original array");
        printArray(arr);
        System.out.println();

        sortByParity(arr);
        System.out.println("Array after sorting");
        printArray(arr);
    }
}
