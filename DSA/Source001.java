import java.util.*;

public class Source001 {

 public static int mostFrequentElement(int[] arr) {

   // Write code here
   int maxCount = 0;
   int ele = -123;
   HashMap <Integer , Integer>
   freq = new HashMap <>();
   for(int i=0; i<arr.length; i++){
       if(freq.containsKey(arr[i]))
       {
           freq.put(arr[i],freq.get(arr[i])+1);
           
       }
       else{
           freq.put(arr[i],1);
           
       }
   }
   for(Map.Entry < Integer,Integer> pair:freq.entrySet())
   {
    if(maxCount < pair.getValue())
    {
        maxCount = pair.getValue();
        ele = pair.getKey();
        
    }
   }
   if(maxCount > 1){
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
