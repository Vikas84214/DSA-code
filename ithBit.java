import java.util.*;
public class ithBit{
    public static int ith(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;

        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(ith(10 , 2));
    }
}
