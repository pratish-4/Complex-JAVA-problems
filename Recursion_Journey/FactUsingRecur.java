import java.util.Scanner;

public class Demoo {

    private static int fact( int n) {
       // Base Case
        if(n==0 || n==1){
            return 1;
        }

       int fact_nm1 = fact(n-1);
        int fact = n * fact_nm1;
        return fact;


    }
    public static void main(String[] args) {
        System.out.println("Please Enter the number of which you need the factorial of : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = fact(n);
        System.out.println(ans);
    }
}
