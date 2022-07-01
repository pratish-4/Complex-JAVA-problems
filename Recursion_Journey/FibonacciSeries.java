import java.util.Scanner;

/**
 * FibonacciSeries-Till_the_Given-Input "n" as a positive Integer
 */
public class FibonacciSeries {

    public static void fibo(int a , int b, int n) {
        int c = a + b; 
        
        System.out.println(c);
        //Base Case
        if(n==1){
            return;
        }
       fibo(b, c, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0, b=1;
        System.out.println(a);
        System.out.println(b);
        fibo(a,b,n-2);       
    }
    
}