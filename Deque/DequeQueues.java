import java.util.*;
public class DequeQueues{
    static class Queue{//Queue class
        Deque<Integer> deque=new LinkedList<>();
        public void add(int data){
            deque.addLast(data);
        }
        public int remove(){
            return deque.removeFirst();
        }
        public int peek(){
            return deque.peekFirst();
        }
    }
    public static void main(String args[]){
        Queue q=new Queue();//this queue is not java collection framework ,This is using Queue class only.
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek="+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}