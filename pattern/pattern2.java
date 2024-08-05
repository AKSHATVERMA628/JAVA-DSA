import java.util.*;
public class pattern2{
    public static void hollow_rectangle(int totrow,int totcol){
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=totcol;j++){
                if(i==1||i==totrow||j==1||j==totcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int totrow=sc.nextInt();
        System.out.println("enter no of colunm");
        int totcol=sc.nextInt();
        hollow_rectangle(totrow,totcol);
    }
}