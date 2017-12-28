package CompetitiveCoding.Codeforces.Round_420;

import java.util.*;

public class OkabeAndFutureGadgetLaboratory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), A[][] = new int[n][n];
        boolean isGood = true;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        outer:
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(A[i][j] == 1)
                    continue;
                if(!doesExist(A, A[i][j], i, j)) {
                    isGood = false;
                    break outer;
                }
            }
        }

        if(isGood)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean doesExist(int[][] A, int number, int row, int column) {
        int rows = A.length;
        int columns = A[0].length;
        // for() {

        // }

        return false;
    }
}
