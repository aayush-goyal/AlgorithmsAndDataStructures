package CompetitiveCoding.Hackerrank.Algorithms;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for(int i=height-1; i>=0; i--) { // height = 6
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=height-i; j>0; j--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}