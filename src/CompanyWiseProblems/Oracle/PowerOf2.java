package CompanyWiseProblems.Oracle;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String srgs[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0; i<T; i++) {
            long number = scanner.nextLong();
            boolean isPower = true;
            if(number == 1) {
                System.out.println("YES");
                continue;
            }
            if(number == 0 || number%2 != 0) {
                isPower = false;
            }
            while(number/2>0) {
                if(number%2 == 1) {
                    isPower = false;
                    break;
                }
                number/=2;
            }

            if(isPower) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}