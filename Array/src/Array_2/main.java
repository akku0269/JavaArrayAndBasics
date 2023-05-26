package Array_2; // sorted or not sorted

public class main {
    public static boolean check(int[] arr ){
        boolean check = true ;
        for (int i =1 ; i< arr.length ; i++){
            if (arr[i]<arr[i-1])
                check = false;
        }
        return check;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        System.out.println(check(arr));






    }
}
