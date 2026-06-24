import java.util.*;
public class breakstatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter your numbers");
            int n = sc.nextInt();

            if(n % 10 ==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
    
}
