import java.util.*;
public class pattern{
public static void main(String args[]){
    int i,j,chars;
    char ch ='A';
    Scanner sc = new Scanner(System.in);
    System.out.print("enter n:");
    int n = sc.nextInt();
    for(chars=1;chars<=n;chars++){
        for(j=1;j<=chars;j++){
            System.out.print(ch);
            ch++;
            
        }
        System.out.println( );
    }
}
}