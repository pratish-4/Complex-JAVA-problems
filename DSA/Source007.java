import java.util.*;

public class Source007 {

    public static void sumBetweenPthToQthSmallestElement(int[] arr, int p, int q) {

       // Write code here
       int sum=0;
       Arrays.sort(arr);
       for(int i=p;i<q-1;i++){
           sum=sum+arr[i];
         
       }
        System.out.println(sum);
      
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        sumBetweenPthToQthSmallestElement(arr, p, q);
    }
}