package CompanyWiseProblems.RandomProblems;

import java.util.Scanner;
import java.util.Stack;

public class EvaluationOfPostfixExpression {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0; i<T; i++) {
            String postfixExpression = scanner.next();

        }
    }

    /*
    private static int calculateValueofExpression(String postfixExpression) {
        Stack<Character> temp = new Stack<>();
        int value = 0, a, b;
        for(int i=0; i<postfixExpression.length(); i++) {
            char currentCharacter = postfixExpression.charAt(i);
            switch(currentCharacter) {
                case '+':
                    a = Character.getNumericValue(temp.pop());
                    b = Character.getNumericValue(temp.pop());
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
    */
}
