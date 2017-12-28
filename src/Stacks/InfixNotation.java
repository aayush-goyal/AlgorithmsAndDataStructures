package Stacks;

import java.util.Stack;

public class InfixNotation {
    public static void main(String args[]) {

    }
/*
    private static String conversionFromPostfixNotation(String expression[]) {
        Stack<String> temp = new Stack<>();
        String infixExpression;
        int value = 0, a, b;
        for(int i=0; i<expression.length; i++) {
            String currentCharacter = expression[i];
            switch (currentCharacter) {
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
                    infixExpression = "(b * a)";
                    temp.push(Integer.toString(value));
                    break;
                case "/":
                    a = Integer.parseInt(temp.pop());
                    b = Integer.parseInt(temp.pop());
                    infixExpression = "(b / a)";
                    temp.push(Integer.toString(value));
                    break;
                default:
                    temp.push(currentCharacter);
                    break;

            }
        }

        return infixExpression;
    }
    */
}
