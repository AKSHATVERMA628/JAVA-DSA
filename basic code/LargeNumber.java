import java.util.*;
public class LargeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a>=b && a>=c){
            System.out.println("A is greater" );
        }
        else if( b>=c){
            System.out.println("B is greater" );  
        }
        else{
            System.out.println("C is greater" );
        }
    }
}