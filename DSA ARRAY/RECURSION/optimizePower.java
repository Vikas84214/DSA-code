package RECURSION;

public class optimizePower {
    public static int optimizationPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int z = optimizationPower(x, n/2);
        int halfPowerSq = z * z;
        if(n%2 != 0){
            halfPowerSq = x * z;

        }

        return halfPowerSq;

    }
    public static void main(String args[]){
        int x = 2;
        int n = 10;
        System.out.println(optimizationPower(x, n));

    }
    
}
