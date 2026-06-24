package RECURSION;

public class decreasingOrder {
    public static void printNumbersInDecreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumbersInDecreasing(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        printNumbersInDecreasing(n);

    }
    
}
