import java.util.*;
public class TernaryOperator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String type = ((n%2)==0) ? "even" : "odd";
        System.out.println(type);
        
    }
}