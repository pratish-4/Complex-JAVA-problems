import java.util.*;

public class Arrey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> Daewoost = new ArrayList<>();
        Daewoost.add(sc.nextLine());
        Daewoost.add(sc.nextLine());
        Daewoost.add(sc.nextLine());
        Daewoost.add(sc.nextLine());
        Daewoost.add(sc.nextLine());
//Daewoost.add("Sumit");
//Daewoost.add("Rahul");
//Daewoost.add("Pratish");
//Daewoost.add("Prathamesh");
//Daewoost.add("Manish");
        // set method
        Daewoost.set(1, "Rahul");
        // for each loop
        for(String company : Daewoost){
        System.out.println(company);
        }
    }
}
