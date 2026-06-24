import java.util.*;
public class substring {
    public static String substrings(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){

        String str = "helloWorld";
        System.out.println(str.substring(0, 5));
        System.out.println(substrings(str, 0, 9));

    }
    
}
