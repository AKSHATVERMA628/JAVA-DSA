import java.util.*;
public class firstOccurence {
    public static int firstOccurence(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
        return firstOccurence(arr,i+1,key);
    }
    public static void main(String args[]){
        int arr[]={8,3,6,3,5,6,3,7,5};
        System.out.println(firstOccurence(arr,0,5));
    }
}
