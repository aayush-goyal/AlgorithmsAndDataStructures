package BitAlgorithms;

import java.util.Scanner;

public class SwapBitsInAGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), n1 = scanner.nextInt(), n2 = scanner.nextInt(), n = scanner.nextInt();

        /* The alogrithm works on the following:
        If XOR1 ^ XOR2 = XOR then XOR1 ^ XOR = XOR1 and XOR2 ^ XOR = XOR1. */

        /* The following methods basically gives us the actual n bits of the number starting from p1 or p2 position from rightside
           by shifting them towards the rightmost positions and making all the rest bits equal to 0. */
        int set1 = (num >> n1) & ((1 << n) - 1);
        int set2 = (num >> n2) & ((1 << n) - 1);
        int xor = set1 ^ set2;
        xor = (xor << n1) | (xor << n2);
        System.out.println(num ^ xor);
    }
}