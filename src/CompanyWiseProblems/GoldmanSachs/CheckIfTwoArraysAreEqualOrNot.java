package CompanyWiseProblems.GoldmanSachs;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfTwoArraysAreEqualOrNot {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(), A[] = new int[N], B[] = new int[N];
            boolean equal=true;

            for(int j=0; j<N; j++) {
                A[j]=scanner.nextInt();
            }

            for(int j=0; j<N; j++) {
                B[j]=scanner.nextInt();
            }

            Arrays.sort(A);
            Arrays.sort(B);

            for(int j=0; j<N; j++) {
                if(A[j] != B[j]) {
                    equal=false;
                    break;
                }
            }

            if(equal) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
