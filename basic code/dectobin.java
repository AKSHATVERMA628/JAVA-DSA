import java.util.*;
public class dectobin{
    public static void dectobin(int n){
        int pow=0;
        int binnum=0;
        int mynum=n;
        int rem;

        while(n>0){
            rem = n%2;
            binnum=binnum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of "+mynum+" = "+binnum);
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int binnum=sc.nextInt();
        dectobin(binnum);
    }
}