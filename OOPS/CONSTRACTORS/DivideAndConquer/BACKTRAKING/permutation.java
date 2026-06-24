package OOPS.CONSTRACTORS.DivideAndConquer.BACKTRAKING;

public class permutation {
    public static void printPermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
            
        }
        //kaam
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //abc= if i pic b then b remove = "a"+ "c"
            String newStr = str.substring(0,i) + str.substring(i+1); 
            printPermutation(newStr, ans+curr);
        }

    }
    public static void main(String args[]){
        String str = "abc";
        printPermutation(str, " ");
    }
    
}
