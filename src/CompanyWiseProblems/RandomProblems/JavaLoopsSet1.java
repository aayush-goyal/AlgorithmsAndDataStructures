package CompanyWiseProblems.RandomProblems;

import java.util.Scanner;

public class JavaLoopsSet1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i=0; i<t; i++) {
            int n = scanner.nextInt(), oddSum = 0, evenSum = 0;
            for(int j=1; j<n+1; j++) {
                if(j%2 == 0) {
                    evenSum += j;
                } else {
                    oddSum += j;
                }
            }
            System.out.println(evenSum + " " + oddSum);
        }
    }
}
