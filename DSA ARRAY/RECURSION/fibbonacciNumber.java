package RECURSION;

public class fibbonacciNumber {
    public static int printFibonacciNumbers(int n){

        if(n == 0|| n == 1){

            return n;
        }
        int fnm1 = printFibonacciNumbers(n-1);
        int fnm2 = printFibonacciNumbers(n-2);
        int fn = fnm1 + fnm2;
        return fn;

    }
    public static void main(String args[]){
        int n = 15;
        System.out.println(printFibonacciNumbers(n));

    }
}
