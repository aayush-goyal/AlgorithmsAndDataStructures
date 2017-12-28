package CompetitiveCoding.Hackerrank.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), BC[] = new int[n], count = 0;

        for(int i=0; i<n; i++) {
            BC[i] = scanner.nextInt();
        }

        Arrays.sort(BC);
        int largest = BC[n-1];

        for(int i=n-1; i>0; i--) {
            if(BC[i] == largest) {
                count++;
            } else {
                break;
            }
        }

        if(BC[0] == largest) {
            count++;
        }

        System.out.println(count);
    }
}