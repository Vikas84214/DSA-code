package ARRAYLIST.STACKS;

import java.util.Stack;

public class Duplicate {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing bracket
            if (ch == ')') {
                int count = 0;

                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    return true; // duplicate brackets
                }

                if (!s.isEmpty()) {
                    s.pop(); // remove '('
                }
            } else {
                // opening or character
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String str = "((a+b))";
        String str2 = "(a-b)";

        System.out.println(isDuplicate(str));   // true
        System.out.println(isDuplicate(str2));  // false
    }
}