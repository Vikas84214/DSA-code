package ARRAYLIST;
import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(9);
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(2); 
        System.out.println(list);
        Collections.sort(list);//asending
        System.out.println(list);
        //desending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
    
}
