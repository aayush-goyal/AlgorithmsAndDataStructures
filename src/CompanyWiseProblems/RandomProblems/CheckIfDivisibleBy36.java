package CompanyWiseProblems.RandomProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class CheckIfDivisibleBy36 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            BigInteger number = new BigInteger(scanner.next()), divisor = new BigInteger("36");
            if(number.remainder(divisor).equals(BigInteger.ZERO)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
