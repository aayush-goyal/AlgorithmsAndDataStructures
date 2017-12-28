package MathematicalAlgorithms;

import java.util.Scanner;

public class CheckIfNumberIsDivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        long number = scanner.nextLong();
        if(isMultipleOf3(number) == 1)
            System.out.println(number + " is multiple of 3.");
        else
            System.out.printf(number + " is not a multiple of 3.");
    }

    // If the difference between odd and even bits in the binary representation of number is multiple of 3 then the number is divible
    // by 3.
    private static int isMultipleOf3(long number) {
        if(number<0)
            number = -number;
        if(number == 0)
            return 1;
        if(number == 1)
            return 0;

        int oddCount = 0;
        int evenCount = 0;
        while(number != 0) {
            if((number & 1) == 1)
                oddCount++;
            number >>= 1;

            if((number & 1) == 1)
                evenCount++;
            number >>= 1;
        }

        return isMultipleOf3(Math.abs(oddCount - evenCount));
    }
}