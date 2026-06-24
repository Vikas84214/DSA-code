import java.util.*;
public class setBit{
    public static int set(int n, int i){
        int bitMask = 1<<i;
        return n| bitMask;

    }
    public static void main(String args[]){
        System.out.println(set(10, 2));
    }
}