package CompetitiveCoding.Hackerrank.Algorithms;

import java.util.Scanner;

public class BirthdayChocolate {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for(int i=0; i<n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int d = scanner.nextInt(), m = scanner.nextInt(), ways = 0;

        for(int i=0; i<n; i++) {
            int sum = 0;

            if(i+m > n)
                break;

            int j = 0;
            while(j < m) {
                sum += numbers[i+j];
                j++;
            }

            if(sum == d)
                ways++;
        }

        System.out.println(ways);
    }
}