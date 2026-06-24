import java.util.*;
public class hashset {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        System.out.println(set);
        set.remove(2);
        System.out.println(set.size());

        if(set.contains(2)){
            System.out.println("set conatains 2");
        if(set.contains(3)){
            System.out.println("set contains 3");
        }
        }

    }
    
}
