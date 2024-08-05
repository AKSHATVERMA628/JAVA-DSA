import java.util.*;
public class getithbit{
    public static int getithbit(int n,int i){
        int bitmass=1<<i;
        if((n&bitmass)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(getithbit(16,2));
    }
}