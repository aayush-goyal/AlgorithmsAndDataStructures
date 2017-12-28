package CompetitiveCoding.GoogleCodeJam._2017.RoundC;

import java.util.Scanner;

public class MagicalThinking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i=0; i<t; i++) {
            int N = scanner.nextInt();
            int Q = scanner.nextInt();
            char[][] A = new char[Q][2];
            int matches = 0, score;

            for(int j=0; j<2; j++) {
                String answer = scanner.next();
                for(int k=0; k<Q; k++) {
                    A[k][j] = answer.charAt(k);
                }
            }

            score = scanner.nextInt();

            for(int j=0; j<Q; j++) {
                if(A[j][0] == A[j][1])
                    matches++;
            }

            if(score == 0) {
                System.out.println("Case #" + i + ": " + (Q-matches));
                continue;
            }

            if(score < matches)
                System.out.println(Q-matches+score);
            else if(score > matches)
                System.out.println(Q+matches-score);
            else
                System.out.println(Q);
        }

    }
}