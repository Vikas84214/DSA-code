package RECURSION;

public class increasingOrder {
    public static void printNumbersInDecreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printNumbersInDecreasing(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        int n = 10;
        printNumbersInDecreasing(n);

    }
    
}