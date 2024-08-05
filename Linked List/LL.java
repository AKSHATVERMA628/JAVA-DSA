public class LL {
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
    public static void main(String args[]){
        LL List=new LL();
        List.head=new Node(1);
        List.head.next=new Node(2);
    }
}
