import java.util.*;
public class loopProgram{
    public static void main(String args[]){
    int counter=1;
    System.out.println("enter n:");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     while(counter<=n){
        System.out.print(counter+" "+counter+" ");
        counter++;
     }   
    }
}