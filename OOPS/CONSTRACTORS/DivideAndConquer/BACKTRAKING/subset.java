package OOPS.CONSTRACTORS.DivideAndConquer.BACKTRAKING;

public class subset {
    public static void printSubsetArr(String str, String ans, int i){
        // base case
        if(i == str.length()){

            if(ans.length() == 0){
                System.out.println("null");

            }else{
                System.out.println(ans);
            }
            return;
        }
        //recursion kaam
        //yes
        printSubsetArr(str, ans+str.charAt(i), i+1);
        //no
         printSubsetArr(str, ans, i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        printSubsetArr(str, " ", 0);


    }
    
}
