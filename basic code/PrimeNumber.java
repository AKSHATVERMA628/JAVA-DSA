import java.util.*;
public class PrimeNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        int i;
        if(n==2){
            System.out.println("Number is prime");
        }
        else{
            boolean isPrime=true;
            for(i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("number is prime");
            }
            else{
                System.out.println("number is not prime");
            }
        }
    }
}