package CompanyWiseProblems.Facebook;

import java.util.*;
import java.util.regex.Pattern;

class DecodeTheString {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        // 3[a3[b]1[ab]] = abbbababbbababbbab
        for(int i=0; i<T; i++) {
            String encoded = scanner.next(), decoded = "";
            Stack<String> stack = new Stack<>();
            for(int j=0; j<encoded.length(); j++) {
                String temp = "";
                if(Pattern.matches("]", Character.toString(encoded.charAt(j)))) {
                    while(!stack.peek().equals("[")) {
                        temp = temp.concat(stack.pop());
                    }
                    stack.pop();
                    StringBuilder tempa = new StringBuilder(temp);
                    temp = tempa.reverse().toString();
                    int multiplier = Integer.parseInt(stack.pop());
                    for(int k=0; k<multiplier; k++) {
                        temp = decoded.concat(temp);
                    }
                    if(!stack.isEmpty()) {
                        stack.push(decoded);
                    }
                } else {
                    stack.push(Character.toString(encoded.charAt(j)));
                }
            }

            System.out.println(decoded);
        }

    }

}