package Array_2.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr= new int[n];


        System.out.println("Enter the Elements of array");

        for (int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the kth element");
        int k = sc.nextInt();
        Arrays.sort(arr);

        System.out.println(arr[k-1]);
      }

    }

