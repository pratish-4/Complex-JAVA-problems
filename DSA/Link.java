public class Link { 

    // Creating a node class
    static Node head;
    static class Node{
        Node next;
        String data;
        //Creating a constructor for Node
        Node (String data){
            this.data = data;
            this.next = null;
        }
    }

    // Creating a add method
     public static Link add(Link list, String data) {
         Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return list;
     }

     // Creating a print method
     public static void print(Link list) {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
          
        }
     }
    public static void main(String[] args) {
        Link list = new Link();
        add(list,"Pratish");
        add(list,"Kumar");
        add(list,"Mohapatra");
        print(list);
    }
}
