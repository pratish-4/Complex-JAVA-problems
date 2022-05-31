
/**
 * Linked
 */
public class Linked {

    // Create a node class 
    Node head;
    class Node{
        Node next;
        String name;
        Node(String name){
            this.name = name;
            this.next = null;
        }
    }
    // Create funtion for insertion in the beginning
    public void insertIntheEnd(String name) {
        Node n1 = new Node(name);
        if(head == null){
            head = n1;
            return;
        }
        else{
            Node currntNode = head;
            while(currntNode.next !=null){
                currntNode = currntNode.next;
            }
            currntNode.next = n1;
        }
    }
    // Creating a print function of the linked list
    public void print() {
        Node currntNode = head;
      while(currntNode !=null){
    System.out.println(currntNode.name);
    currntNode = currntNode.next;
    }
}
    public static void main(String[] args) {
        Linked list = new Linked();
        list.insertIntheEnd("Pratish");
        list.insertIntheEnd("Kumar");
        list.insertIntheEnd("Mohapatra");
        list.print();
    }
}