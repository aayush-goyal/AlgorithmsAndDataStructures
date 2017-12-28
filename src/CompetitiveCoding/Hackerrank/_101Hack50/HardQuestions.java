package CompetitiveCoding.Hackerrank._101Hack50;

import java.util.Scanner;

public class HardQuestions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NOQ = scanner.nextInt();

        String vAnswers = scanner.next(), cAnswers = scanner.next();
        int maxScore = vAnswers.length();
        for(int i=0; i<NOQ; i++) {
            if(vAnswers.charAt(i) == '.') {
                maxScore--;
            } else if(vAnswers.charAt(i) == cAnswers.charAt(i)) {
                maxScore--;
            }
        }

        System.out.println(maxScore);
    }
}