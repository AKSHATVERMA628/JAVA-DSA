import java.util.*;
public class strings {
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String firstname="akshat";
        String lastname="verma";
        String fullname=firstname+" "+lastname;
        printletter(fullname);
    }
}