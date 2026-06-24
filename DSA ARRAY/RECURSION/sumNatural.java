package RECURSION;

public class sumNatural {
    public static int printSumOfNaturalNumbers(int n){
    if(n == 1){  
        return 1;
    }
        int snm1 = printSumOfNaturalNumbers(n-1);
        int sn = n + snm1;
        return sn;

        }

    public static void main(String args[]){
        int n = 10;
        System.out.println(printSumOfNaturalNumbers(n));

    }
}
