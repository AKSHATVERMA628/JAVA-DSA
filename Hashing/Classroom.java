import java.util.*;
public class Classroom{
    public static void main(String args[]){
        //create
        HashMap<String,Integer> hm=new HashMap<>();

        //insert-O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Bhutan",1);
        hm.put("US",50);

        System.out.println(hm);
        // //Get -O(1)
        // int population=hm.get("India");
        // System.out.println(population);
        // System.out.println(hm.get("indonesia"));

        // //containskey-O(1)
        // System.out.println(hm.containsKey("India"));//true
        // System.out.println(hm.containsKey("Indonesia"));//false
        
        //remove-O(1)
        // System.out.println(hm.remove("indonesia"));
        // System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}