package CompanyWiseProblems.Zoho;

import java.util.Scanner;

public class TotalCount {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0; i<T; i++) {
            int N = scanner.nextInt(), k = scanner.nextInt(), A[] = new int[N]; int totalCount = 0;

            for(int j=0; j<N; j++) {
                A[j] = scanner.nextInt();
            }

            for(int j=0; j<N; j++) {
                totalCount += Math.ceil(A[j]/k);
                System.out.println(totalCount);
            }

            System.out.println(totalCount);
        }
    }
}