package ProblemsInArray1;

import java.util.Scanner;

public class A3 {
    static int findUNIQUE(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = -1;
                }

            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return arr[i];

            }
        }
        return 1;
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

        System.out.println(findUNIQUE(arr));

    }
}
