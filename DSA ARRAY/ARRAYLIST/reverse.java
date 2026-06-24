package ARRAYLIST;
import java.util.ArrayList;

public class reverse {

    public static void main(String args[]){ 
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        // Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
}