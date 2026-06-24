import java.util.Scanner;

public class SI {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float P = sc.nextFloat();
        float R = sc.nextFloat();
        float T = sc.nextFloat();
        
        float SI = (P*R*T)/100;
        System.err.println(SI);

        
    }
    
}
