package CompanyWiseProblems.Wipro;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=1; i<T; i++) {
            int N = scanner.nextInt(), sum = 0;

            for(int j=1; j<=N/2; j++) {
                if(N%j == 0)
                    sum += j;
            }

            if(sum == N)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}