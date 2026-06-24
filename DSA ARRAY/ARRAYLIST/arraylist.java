package ARRAYLIST;
import java.util.ArrayList;

public class arraylist {

    public static void main(String args[]){ 
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        // Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1, 12); //O(n)
        System.out.println(list);
        //Get element
        int element = list.get(2);
        System.out.println(element);
        // remove element 
        list.remove(2);
        System.out.println(list);
        // set element at index
        list.set(2, 10);
        System.out.println(list);
        // contains elements
        System.out.println(list.contains(10));
        System.out.println(list.contains(11));
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

         


    }
    
}
