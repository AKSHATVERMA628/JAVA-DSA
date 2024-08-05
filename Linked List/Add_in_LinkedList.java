public class Add_in_LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addFirst(int data){
        //create 
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public static void main(String args[]){
        Add_in_LinkedList LL=new Add_in_LinkedList();
        // LL.head=new Node(1);
        // LL.head.next=new Node(2);
        addFirst(1);
        addFirst(2);
    }
}
