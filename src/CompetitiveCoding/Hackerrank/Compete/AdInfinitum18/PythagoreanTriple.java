package CompetitiveCoding.Hackerrank.Compete.AdInfinitum18;

import java.util.Scanner;

public class PythagoreanTriple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long[] A = triangle(a);

        System.out.println(A[0] + " " + A[1] + " " + A[2]);
    }

    private static long[] triangle(long num) {
        long a = num, b = 0, c= 0;
        if(a%2 != 0) {
            b = (long)((Math.pow(a,2)-1)/2);
            c = b+1;
            long[] A = {a, b, c};
            return A;
        } else if(a == 4) {
            b =3;
            c = 5;
            long A[] = {b, a, c};
            return A;
        } else {
            a = a/2;
            long A[] = triangle(a);
            for(int i=0; i<3; i++) {
                A[i] *= 2;
            }
            return A;
        }
    }
}