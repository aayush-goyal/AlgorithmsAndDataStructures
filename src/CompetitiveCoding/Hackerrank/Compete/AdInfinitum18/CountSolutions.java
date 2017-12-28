package CompetitiveCoding.Hackerrank.Compete.AdInfinitum18;

import java.util.*;

public class CountSolutions {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for(int i=0; i<q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            int count = 0, greater, y;
            double x;

            for(int j=1; j<=d; j++) {
                y = j;
                x = (a+(Math.sqrt(Math.pow(a, 2)-(4*Math.pow(y, 2))+(4*b*y))))/2;
                if (x<=c && x>=1 && Math.ceil(x)-x == 0) {
                    count++;
                }
                x = (a-(Math.sqrt(Math.pow(a, 2)-(4*Math.pow(y, 2))+(4*b*y))))/2;
                if (x<=c && x>=1 && Math.ceil(x)-x == 0) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}