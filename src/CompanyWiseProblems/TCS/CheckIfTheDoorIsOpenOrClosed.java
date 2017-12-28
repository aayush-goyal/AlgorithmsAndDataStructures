package CompanyWiseProblems.TCS;

import java.util.Scanner;

public class CheckIfTheDoorIsOpenOrClosed {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt(), doors[] = new int[n];

            for (int j=0; j<n; j++) {
                doors[j] = 0;
            }

            for (int j=0; j<n; j++) {
                for (int k=n-1; k>=0; k--) {
                    if ((k+1)%(j+1) == 0) {
                        if(doors[k] == 0) {
                            doors[k] = 1;
                        } else {
                            doors[k] = 0;
                        }
                    }
                }
            }

            for (int j=0; j<n; j++) {
                System.out.print(doors[j] + " ");
            }
            System.out.println();
        }
    }
}
