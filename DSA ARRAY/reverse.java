import java.util.*;
public class reverse {
    public static void reverseNumbers(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;

        }
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
 
        reverseNumbers(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]+ "");

        }

    }
    
}
