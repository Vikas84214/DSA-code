import java.util.*;

public class Strings {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[]){
        /*char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
        sc.close();
        String fulName ="Tony Stark";
        System.out.println(fulName.length());*/
        //concatenation
        String firstName ="Tony";
        String lastName ="Stark";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);

        printLetters(fullName);



    }
}