package RECURSION;

public class powerOfn {
    public static int printXofPowern(int n, int x){
        if(n == 0){
            return 1;
        }
        //int xnm1 = power(x, n-1);
        //int xn = x *snm1;
        //return xn;
        return x * printXofPowern(n-1, x);


    }
    public static void main(String args[]){

        System.out.println(printXofPowern(2,10));

    }
    
}
