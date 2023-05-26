package Array_2;

public class ArrayReferance {
    static  void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");}
    }

        public static void main(String[] args) {
            int[] arr = {2, 5, 3, 4, 9};
            System.out.println("Original array");
            printArray(arr);

            // for(int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i] + " ");
            System.out.println();
            System.out.println("Referance array");
            int[] arr_2 = arr;
            printArray(arr_2);
            //  for(int i = 0; i < arr.length; i++) {
            //   System.out.print(arr[i] + " ");


        }
    }