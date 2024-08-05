import java.util.*;
public class inverted_pyramid{
    public static void inverted_pyramid(int n){
        for(int i=1;i<=n;i++){
               for(int j=1;j<=n-i;j++){
                System.out.print(" ");
        }
                 for(int j=1;j<=i;j++){
                   System.out.print("*");
    }
    System.out.println();
    }
    }
   
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("ente n :");
        int n = sc.nextInt();
        inverted_pyramid(n);
    }
}