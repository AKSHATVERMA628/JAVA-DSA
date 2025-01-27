import java.util.*;

public class LinkedHashMapDemo{
    public static void main(String args[]){
        LinkedHashMap<String, Integer> lhm=new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("US",50);

        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        TreeMap<String, Integer> thm=new TreeMap<>();
        thm.put("India",100);
        thm.put("China",150);
        thm.put("US",50);

        System.out.println(hm);
        System.out.println(lhm);
        System.out.println(thm);
    }
}