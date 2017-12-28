package CompanyWiseProblems.RandomProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class CheckIfDivisibleBy5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            BigInteger number = new BigInteger(scanner.next()), five = new BigInteger("5");
            if(number.remainder(five).equals(BigInteger.ZERO)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
