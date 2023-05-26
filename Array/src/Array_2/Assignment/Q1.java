package Array_2.Assignment;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();

        int[] ans = new int[n];
        int[] arr= new int[n];
        System.out.println("Enter the Elements of array");
             for (int i = 0 ; i<n ; i++){
             arr[i] = sc.nextInt();
             }
             int a = 0;
        for (int i = 0 ; i<n ; i++){
        if(arr[i]>=0){
            ans[a] = arr[i];
            a++;

        }
        }

     for (int i = 0 ; i<n ; i++){
         if(arr[i]<0){
        ans[a] = arr[i];
        a++;
         }
     }
        for (int i = 0 ; i<n ; i++){
            System.out.print(ans[i] +"");
        }
}}