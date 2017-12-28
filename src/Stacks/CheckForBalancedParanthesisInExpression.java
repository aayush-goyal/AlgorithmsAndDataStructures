package Stacks;

import java.io.*;
import java.util.Stack;

public class CheckForBalancedParanthesisInExpression {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String brackets = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;
            for(int i=0; i<brackets.length(); i++) {
                if(brackets.charAt(i) == '(' || brackets.charAt(i) == '[' || brackets.charAt(i) == '{')
                    stack.push(brackets.charAt(i));
                else {
                    if(!stack.isEmpty() && findEquivalentStartingBracket(brackets.charAt(i)) != stack.peek()) {
                        isBalanced = false;
                        break;
                    } else if(stack.isEmpty()) {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if(!stack.isEmpty())
                isBalanced = false;

            if(isBalanced)
                System.out.println("Balanced");
            else
                System.out.println("Not Balanced");
        } catch(IOException ioe) {
            System.out.println("Unexpected error occurred.");
        }
    }

    private static char findEquivalentStartingBracket(char bracket) {
        switch(bracket) {
            case ')':
                return '(';
            case ']':
                return '[';
            case '}':
                return  '{';
            default:
                return '0';
        }
    }
}