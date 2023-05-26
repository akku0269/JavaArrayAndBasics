package ProblemInArray2;

public class Swap2No {
    static void swap(int a , int b){
        System.out.println("original Value befor swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value after swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    public static void main(String[] args) {

        int a = 5 ;
        int b = 10;
        swap(a,b);
    }
}
