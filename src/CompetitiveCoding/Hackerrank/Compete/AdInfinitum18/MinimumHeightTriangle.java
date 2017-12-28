package CompetitiveCoding.Hackerrank.Compete.AdInfinitum18;

import java.util.Scanner;

public class MinimumHeightTriangle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double b = scanner.nextDouble();
        double a = scanner.nextDouble();

        int h = (int) Math.ceil((2*a)/b);
        System.out.println(h);
    }
}
