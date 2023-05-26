package ProblemInArray2;

public class Swap2ndMethod {
static void swap(int a , int b){
    System.out.println("original Value befor swap");
    System.out.println("a:"+a);
    System.out.println("b:"+b);
    a=a+b;
    b=a-b;
    a=a-b;
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

