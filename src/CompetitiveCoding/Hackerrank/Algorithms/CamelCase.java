package CompetitiveCoding.Hackerrank.Algorithms;

import java.util.Scanner;
import java.util.regex.Pattern;

class CamelCase {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.next();

        int count = 1;
        for(int i=0; i<test.length(); i++) {
            if(Pattern.matches("[A-Z]", Character.toString(test.charAt(i)))) {
                count++;
            }
        }

        System.out.println(count);
    }
}