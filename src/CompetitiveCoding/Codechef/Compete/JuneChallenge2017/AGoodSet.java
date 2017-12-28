package CompetitiveCoding.Codechef.Compete.JuneChallenge2017;

import java.util.Random;
import java.util.Scanner;

public class AGoodSet {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0; i<T; i++) {
            int n = scanner.nextInt();
            if(n == 1 || n == 2) {
                Random random = new Random();
                random.nextInt(500);
            } else {
                Random random = new Random();
                int A[] = new int[n];
                A[0] = random.nextInt();
                A[1] = random.nextInt();
            }
        }
    }
}
