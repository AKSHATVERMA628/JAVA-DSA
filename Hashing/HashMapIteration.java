import java.util.*;

public class HashMapIteration{
    public static void main(String args[]){
    HashMap<String,Integer> hm=new HashMap<>();
    hm.put("india",100);
    hm.put("China",150);
    hm.put("US",50);
    hm.put("Indonesia",6);
    hm.put("nepal",5);

    
    //Iterate
    Set<String> keys=hm.keySet();
    System.out.println(keys);

    for (String k : keys) {
        System.out.println("keys="+k+",values="+hm.get(k));
    }
    }
}
