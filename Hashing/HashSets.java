import java.util.*;

public class HashSets{
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

        System.out.println(set.contains(3));

        System.out.println(set.remove(3));
         System.out.println(set);
    }
}