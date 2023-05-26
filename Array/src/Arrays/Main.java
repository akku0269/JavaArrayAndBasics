package Arrays;

 class ArrayExample {


     void multiArray(){
         int[][] arr_1  = new int[5][4];

         arr_1[1][2] = 10 ;
         arr_1[1][3] = 15 ;
         arr_1[4][3] = 5 ;
         arr_1[2][2] = 2 ;

         System.out.println(arr_1[1][2]);
         System.out.println(arr_1[1][3]);
         System.out.println(arr_1[4][3]);
         System.out.println(arr_1[2][2]);
     }
    void demoArrays(){
         int [] ages = new int[3];// ages[0] , ages[1] , ages[2]
         float [] weights = new float[3];
         String [] names = new String[3];


         ages[0] = 34;
         ages[1] = 12;
         ages[2] = 45;
        // ages[5] = 45; // out of bounds

         System.out.println(ages[0]);
         System.out.println(ages[1]);
         System.out.println(ages[2]);

         weights[0] = 25.7f;

         System.out.println(weights[0]);



     }
}

public class Main {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArrays();
        obj.multiArray();

    }
}
