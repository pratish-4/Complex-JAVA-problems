/**
 * RevStackusinRec
 */
import java.util.*;

public class RevStackusinRec {

    private static void rever (Stack <Character> stk) {
        
        // Base case
        if(stk.size()>0){
            return;
        }

        // recursive
        char temp = stk.peek();
        stk.pop();
        rever(stk);

        // back tracking
        insertAtBottom(stk,temp);
    }
    
    public static void insertAtBottom(Stack <Character> stk, char x) {
        
        //base 
        if(stk.isEmpty()){
            stk.push(x);
        }

        else{
            char temp = stk.peek();
        stk.pop();
        insertAtBottom(stk, x);
        
        // back track 
        stk.push(temp);
        }
        // 
    }


    public static void main(String[] args) {
        Stack <Character> letters = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string:");
        String name = sc.nextLine();

        for (int i = 0; i < name.length(); i++) {
           letters.push(name.charAt(i)) ;
        }
        System.out.println("Input string converted to char stack :"+letters);
        
        rever(letters);

        System.out.println(letters);
    }
}