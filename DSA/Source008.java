import java.util.*;

public class Source008 {

    public static void symmetricPair(int[][] arr) {
        // Write code here
        HashMap<Integer,Integer> pair=new HashMap<>();
        for(int i=0;i<arr.length;i++){
        int key=arr[i][0];
        int value=arr[i][1];
        if(pair.containsKey(value)&&pair.get(value)==key){
            System.out.println(value+" "+key);
        }
        else{
            pair.put(key,value);
        }
    }
}

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int arr[][] = new int[row][2];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        symmetricPair(arr);
    }
}