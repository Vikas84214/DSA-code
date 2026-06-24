package RECURSION;

public class tilling {
    public static int floorTilling(int n){
        //base case
        if(n == 0 || n ==1){
            return 1;
        }
        //kaam
        //choice-vertical choice
        int fnm1 = floorTilling(n-1);
        //choice- horizontal choice
        int fnm2 = floorTilling(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(floorTilling(4));
    }    
}
