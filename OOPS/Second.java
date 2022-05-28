public class Second {
    
}
/**
 * public class LinkedList {
     Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next = null;
        }
    }
    public static LinkedList add(LinkedList list, int data){
        Node n = new Node(data);
        if(list.head == null){
            list.head = n;
        }
        else {
            Node temp = list.head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=n;
        }
        return list;
    }
    public static void print(LinkedList list){
        Node temp = list.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
     
    }
    public static void middle(LinkedList list)
    {
        Node slow=list.head;
        Node fast=list.head;
        while(fast!=null  && fast.next!=null && fast.next.next!=null )    // 1st case   1 2 3 4 => 2 as a middle element
        {
            slow=slow.next;
            fast=fast.next.next;
        }
           System.out.println(slow.data);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = add(list,1);
        list = add(list,2);
        list = add(list,3);
      
        // list = add(list,4);
        print(list);
        middle(list);
    }
}
 */
/**
 * public class LinkedList {
     Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next = null;
        }
    }
    public static LinkedList add(LinkedList list, int data){
        Node n = new Node(data);
        if(list.head == null){
            list.head = n;
        }
        else {
            Node temp = list.head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=n;
        }
        return list;
    }
    public static void print(LinkedList list){
        Node temp = list.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
     
    }
    public static void middle(LinkedList list)
    {
        Node slow=list.head;
        Node fast=list.head;
        while(fast!=null  && fast.next!=null  )    // 1st case   1 2 3 4 => 2 as a middle element
        {
            slow=slow.next;
            fast=fast.next.next;
        }
           System.out.println(slow.data);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = add(list,1);
        list = add(list,2);
        list = add(list,3);
      
         list = add(list,4);
        print(list);
        middle(list);
    }
}
 */
