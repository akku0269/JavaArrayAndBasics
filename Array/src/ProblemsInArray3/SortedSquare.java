package ProblemsInArray3;

import java.util.Scanner;

public class SortedSquare {

static void swap(int[] arr , int i , int j){
int temp = arr[i];
arr[i]= arr[j];
arr[j] = temp;

}
    static void reverse(int[] arr) {
        int i=0 ; int j= arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;

        }
}

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int k = 0;
        int[] ans = new int[n];


        while (i <= j) {
            if (Math.abs(arr[i]) < Math.abs(arr[j])) {
                arr[j] *= arr[j] ;
                ans[k++] = arr[j--];
            }
            else{
                arr[i] *= arr[i] ;
                ans[k++] = arr[i++];
            }
        }
        reverse(ans);
      return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-8,-5,-2,4,6,9};  // give arr in sorted form

        int [] ans = sortedSquares(arr);

        System.out.println("Array after sorting");
        printArray(ans);
    }
}

