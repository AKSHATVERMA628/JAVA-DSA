import java.util.*;
public class menu{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        switch(number){
            case 1:System.out.println("samaosa");
            break;
            case 2:System.out.println("burger");
            break;
            case 3:System.out.println("cold drink");
            break;
            default:System.out.println("404 error");
        }
    }
}