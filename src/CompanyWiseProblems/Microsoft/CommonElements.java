package CompanyWiseProblems.Microsoft;

import SearchingAndSorting.Searching.BinarySearch;

import java.util.Scanner;

public class CommonElements {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N1 = scanner.nextInt(), A[] = new int[N1];
            int N2 = scanner.nextInt(), B[] = new int[N2];
            int N3 = scanner.nextInt(), C[] = new int[N3];
            int count = 0;

            for (int j = 0; j < N1; j++) {
                A[j] = scanner.nextInt();
            }

            for (int j = 0; j < N2; j++) {
                B[j] = scanner.nextInt();
            }

            for (int j = 0; j < N3; j++) {
                C[j] = scanner.nextInt();
            }

            for (int j = 0; j < N1; j++) {
                if (j > 0 && A[j] == A[j - 1])
                    continue;

                if (BinarySearch.binarySearch(B, A[j]) != -1 && BinarySearch.binarySearch(C, A[j]) != -1) {
                    count++;
                    System.out.print(A[j] + " ");
                }
            }

            if (count == 0) {
                System.out.print(-1);
            }

            System.out.println();
        }
    }
}