package CompetitiveCoding.Topcoder;

import java.util.Scanner;

class MicroStrings {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int D = scanner.nextInt();
        System.out.println(makeMicroString(A, D));
    }

    static String makeMicroString(int A, int D) {
        StringBuilder microString = new StringBuilder();
        do {
            microString.append(A);
            A-=D;
        } while(A>=0);
        return microString.toString();
    }
}