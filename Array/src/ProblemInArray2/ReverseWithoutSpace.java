package ProblemInArray2;

public class ReverseWithoutSpace {
    static void printArray(int[] arr ) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    static void swap(int[] arr , int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void RotateInPlace(int[] arr, int k) {

        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Enter K");

        int k = 4;

        RotateInPlace(arr, k);
        printArray(arr);

    }
}



