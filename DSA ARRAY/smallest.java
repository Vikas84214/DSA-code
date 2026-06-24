import java.util.*;
public class smallest {
    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers[] = {1, 3, 5, 6, 7, 9};
        System.out.println("the smallest number is = "+ getSmallest(numbers));
    }
}
