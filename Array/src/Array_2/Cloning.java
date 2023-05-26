package Array_2;

public class Cloning {
    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");}
        }

public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 9};
        System.out.println("Original array");
        printArray(arr);

        System.out.println();
        System.out.println("Referance array");
        int[] arr2 = arr.clone();

        arr2[0] = 5;
        arr2[1] = 0;
        arr2[2] = 2;
        printArray(arr2);



        }
        }
