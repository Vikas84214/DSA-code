package OOPS.GREEDY.TREE.HEAPS.HASHING;

import java.util.*;

public class basic1 {
     public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 100);
        hm.put("nepal", 120);
        hm.put("chaina", 150);
        hm.put("america", 180);
        hm.put("indonesia", 200);
        //System.out.print(hm);

        //int population = hm.get("america");
        //System.out.println(population +" ");

        //System.out.println(hm.get("pakistan"));

        //System.out.println(hm.containsKey("bootan"));
        //System.out.println(hm.containsKey("chaina"));

        //int dlt = hm.remove("america");
        //hm.remove("south africa");
        //System.out.println(hm);

        //System.out.println(hm.size());
        //System.out.println(hm.isEmpty());
        //hm.clear();
        //System.out.println(hm.isEmpty());

        //iteratate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key="+k+", values="+hm.get(k));
        }
     }
}
