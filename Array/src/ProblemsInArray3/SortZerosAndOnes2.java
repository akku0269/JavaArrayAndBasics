package ProblemsInArray3;

import java.util.Scanner;

public class SortZerosAndOnes2 {

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void sortZerosAndOnes2(int[] arr){
        int n = arr.length;
        int Zeros = 0;


        for(int i =0 ; i<n ; i++){
            if(arr[i]==0){
                Zeros++;
            }
        }
        for(int i = 0 ; i<n ; i++){
            if(i<Zeros){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
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
        System.out.println("original array");
        printArray(arr);
        System.out.println();

        sortZerosAndOnes2(arr);
        System.out.println("Array after sorting");
        printArray(arr);
    }
}



























