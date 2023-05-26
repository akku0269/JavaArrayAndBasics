package Array_2.Assignment;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();

        int[] arr2 = new int[n];
        int[] arr1= new int[n];
        System.out.println("Enter the Elements of array");
        for (int i = 0 ; i<n ; i++){
            arr1[i] = sc.nextInt();
        }
        boolean ans = true ;
        for(int i = 0 ; i<n ; i++){
            arr2[i] = sc.nextInt();
            if (arr1[i]!=arr2[i]){
                ans = false;
                break;

            }
        }
        System.out.println(ans);

    }
}
