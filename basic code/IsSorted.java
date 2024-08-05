import java.util.*;
public class IsSorted {
    public static boolean IsSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return IsSorted(arr,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,242,3443,4};
        System.out.println(IsSorted(arr,0));
    }
}
