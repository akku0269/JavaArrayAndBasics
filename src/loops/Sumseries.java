package loops;
import java.util.Scanner;

//        Sum =1-2+3-4...n          //

public class Sumseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        int i = 1;
        while(i<=n ){
            
        if(i % 2 == 0){
            ans=ans-i;
        }
        else{
            ans=ans+i;
        }
        i++;

    }
        System.out.println(ans);
}}
