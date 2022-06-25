import java.util.*;

public class Source005 {

 public static int mostFrequentElement(int[] arr) {

   // Write code here
   int max=0;
   int ele=-1;
   
   for(int i=0;i<arr.length;i++){
       int count=0;
       for(int j=i+1;j<arr.length;j++){
           if(arr[i]==arr[j]){
               count++;
              
           }
        }
        if(max<count){
            max=count;
            ele=arr[i];
        }
   }
   if(max>1){
       return ele;
   }
   return -1;
    
}

 public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(mostFrequentElement(arr));
 }
}