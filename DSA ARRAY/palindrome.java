import java.util.*;
public class palindrome {
    public static boolean palindromeCheck(String str){
        for(int i=0; i<str.length()/2; i++){
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "racecdr";
        System.out.println(palindromeCheck(str));
    }
    //tc = o(n)
}