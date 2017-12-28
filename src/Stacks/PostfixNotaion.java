package Stacks;

import java.util.ArrayList;
import java.util.Stack;

// TODO: Implement using String rather than an array of String.
public class PostfixNotaion {
    public static void main(String args[]) {
        String expression[] = {"5", "6", "2", "+", "*", "12", "4", "/", "-"};
        System.out.println(calculateValueofExpression(expression));
        String expression1[] = {"A", "+", "(", "B", "*", "C", "-", "(", "D", "/", "E", "^", "F", ")", "*", "G", ")", "*", "H"};
        System.out.println(conversionFromInfixNotation(expression1));
    }

    private static String conversionFromInfixNotation(String expression[]) {
        String postfixExpression = "";
        ArrayList<String> postfixExpressionArray = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        for(int i=0; i<expression.length; i++) {
            if(expression[i].equals("(")) {
                stack.push(expression[i]);
            } else if(expression[i].equals("^") ||
                    expression[i].equals("/") ||
                    expression[i].equals("*") ||
                    expression[i].equals("+") ||
                    expression[i].equals("-")) {
                while(!stack.isEmpty() && Prec(expression[i]) <= Prec(stack.peek())) {
                    postfixExpressionArray.add(stack.pop());
                }
                stack.add(expression[i]);
            } else if(expression[i].equals(")")) {
                while(!stack.peek().equals("(")) {
                    postfixExpressionArray.add(stack.pop());
                }
                stack.pop();
            } else {
                postfixExpressionArray.add(expression[i]);
            }
        }

        while (!stack.isEmpty())
            postfixExpressionArray.add(stack.pop());

        for(String element: postfixExpressionArray) {
            postfixExpression = postfixExpression.concat(element);
        }
        return postfixExpression;
    }

    private static int calculateValueofExpression(String expression[]) {
        Stack<String> temp = new Stack<>();
        int value = 0, a, b;
        for(int i=0; i<expression.length; i++) {
            String currentCharacter = expression[i];
            switch(currentCharacter) {
                case "+":
                    a = Integer.parseInt(temp.pop());
                    b = Integer.parseInt(temp.pop());
                    value = a + b;
                    temp.push(Integer.toString(value));
                    break;
                case "-":
                    a = Integer.parseInt(temp.pop());
                    b = Integer.parseInt(temp.pop());
                    value = b - a;
                    temp.push(Integer.toString(value));
                    break;
                case "*":
                    a = Integer.parseInt(temp.pop());
                    b = Integer.parseInt(temp.pop());
                    value = a * b;
                    temp.push(Integer.toString(value));
                    break;
                case "/":
                    a = Integer.parseInt(temp.pop());
                    b = Integer.parseInt(temp.pop());
                    value = b / a;
                    temp.push(Integer.toString(value));
                    break;
                default:
                    temp.push(currentCharacter);
                    break;
            }
        }

        return value;
    }

    private static int Prec(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;

            case "*":
            case "/":
                return 2;

            case "^":
                return 3;
        }
        return -1;
    }
}