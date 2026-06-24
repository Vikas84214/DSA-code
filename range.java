import java.util.*;
public class range {
    public static int clearRangeBit(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;



    }
    public static void main(String args[]){
        System.out.println(clearRangeBit(15, 2, 5));

    }
    
}
