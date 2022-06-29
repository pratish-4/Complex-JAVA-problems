import java.util.Scanner;

/**
 * This program will take an input "n" from the user,
 * and print the sum from 1 to "n". 
 * The significance of this program is IT USES RECURSION
 */
public class SumofdigitsFrom1ton {

    public static void recur(int i, int n, int sum) {
        // base case
        if(i==n){
            sum =sum + n;
            System.out.println("The sum from 1 to n is :"+sum);
            return;
        }
        //hypothesis and Induction
        sum = sum + i;
        recur(i+1,n,sum);
    }

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value 'n' until which you want to get the sum of ");
         int n = sc.nextInt();
         recur(1,n,0);
    }
}

