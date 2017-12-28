package CompanyWiseProblems.Amazon;

import java.util.Scanner;

public class CountTheElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0; i<T; i++) {
            int N = scanner.nextInt();
            int[] A = new int[N], B = new int[N];

            for(int j=0; j<N; j++) {
                A[j] = scanner.nextInt();
            }

            for(int j=0; j<N; j++) {
                B[j] = scanner.nextInt();
            }

            int count = 0;

            for(int j=0; j<N; j++) {
                for(int k=0; k<N; k++) {
                    if(B[k] <= A[j])
                        count++;
                }
                if(j == N-1)
                    System.out.print(count);
                else
                    System.out.print(count + ",");
                count = 0;
            }

            System.out.println();
        }
    }
}
