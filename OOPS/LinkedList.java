public class LinkedList {

    // nested class (to create a node in a linked list)
    static Node head;
    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static LinkedList add(LinkedList list, int data) {
        Node obj = new Node(data);
        if (head == null){
            head = obj;
        }
        else{
            Node temp = head
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = obj;
        }
        return list;
    }

    public void print() {   
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        add(list,1);
        add(list,2);
        add(list,3);
        add(list,4);

    }
}
