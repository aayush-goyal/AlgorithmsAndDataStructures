package CompetitiveCoding.Hackerrank.Compete.AdInfinitum18;

import java.math.BigInteger;
import java.util.Scanner;

public class Tower3_Coloring {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long m = 1000000007;
        long ts = 1;

        for(int i = 0; i<n; i++) {
            ts = (ts*27);
        }

        System.out.println(ts%m);
    }
}