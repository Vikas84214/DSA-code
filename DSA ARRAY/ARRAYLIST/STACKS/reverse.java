package ARRAYLIST.STACKS;

import java.util.Stack;

public class reverse {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStacks(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStacks(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        Stack<Integer> temp = new Stack<>();
        
        while(!s.isEmpty()){
            int val = s.pop();
            System.out.println(val);
            temp.push(val);
        }

        // restore original stack
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
    }

    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Original Stack:");
        printStack(s);

        reverseStacks(s);

        System.out.println("Reversed Stack:");
        printStack(s);
    }
}