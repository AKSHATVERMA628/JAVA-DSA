import java.util.*;
public class ReverseAStack {
    public static void PushAtBottom(Stack<Integer>s,int Data){
        if(s.isEmpty()){
            s.push(Data);
            return;
        }
        int top=s.pop();
        PushAtBottom(s,Data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        PushAtBottom(s,top);
    }
    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3 2 1
        reverseStack(s);
        printStack(s);
        //1 2 3
    }
}
