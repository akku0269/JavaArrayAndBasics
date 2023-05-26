package Arrays;


public class PostitiveNumbers {
    public static void main(String[] args)

     {
        int[] array =   {2, 6, -5, -1, 0, 4, -9};
        for (int val : array)
        if ( val >= 0 ){
            System.out.println(val);
        }
    }
}
