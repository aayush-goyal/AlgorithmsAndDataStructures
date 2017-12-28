package CompetitiveCoding.Hackerrank.Compete.WeekOfCode33;

import java.util.Scanner;

public class PatternCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for(int i=0; i<q; i++) {
            String word = scanner.next();
            boolean firstOne = false;
            int count = 0;
            for(int j=1; j<word.length(); j++) {
                if(!firstOne && word.charAt(j) == '0' && word.charAt(j-1) == '1') {
                    firstOne = true;
                } else if(firstOne && word.charAt(j) == '1' && word.charAt(j-1) != '1') {
                    count++;
                } else if(firstOne && word.charAt(j) != '0') {
                    firstOne = false;
                }
            }
            System.out.println(count);
        }
    }
}