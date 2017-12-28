package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;
import java.util.Stack;

class TransformTheExpression {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();

        for(int j=0; j<noc; j++) {
            String expression = scanner.next(), postfixExpression = "";
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < expression.length(); i++) {
                if (expression.charAt(i) == '(') {
                    stack.push(expression.charAt(i));
                } else if (expression.charAt(i) == '^' ||
                        expression.charAt(i) == '/' ||
                        expression.charAt(i) == '*' ||
                        expression.charAt(i) == '+' ||
                        expression.charAt(i) == '-') {
                    while (!stack.isEmpty() && Prec(expression.charAt(i)) <= Prec(stack.peek()))
                        postfixExpression = postfixExpression.concat(Character.toString(stack.pop()));
                    stack.add(expression.charAt(i));
                } else if (expression.charAt(i) == ')') {
                    while (stack.peek() != '(') {
                        postfixExpression = postfixExpression.concat(Character.toString(stack.pop()));
                    }
                    stack.pop();
                } else {
                    postfixExpression = postfixExpression.concat(Character.toString(expression.charAt(i)));
                }
            }

            while (!stack.isEmpty())
                postfixExpression = postfixExpression.concat(Character.toString(stack.pop()));// postfixExpressionArray.add(stack.pop());

            System.out.println(postfixExpression);
        }
    }

    private static int Prec(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
}