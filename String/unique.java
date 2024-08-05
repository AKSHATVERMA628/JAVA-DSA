import java.util.*;
public class unique {
    public static void main(String args[]){
        int n=7;
        int arr[]={1,1,2,2,3,3,4};
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans^arr[i];
        }
        System.out.println("unique number="+ans);
    }
}
