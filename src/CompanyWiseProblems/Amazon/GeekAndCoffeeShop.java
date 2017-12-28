package CompanyWiseProblems.Amazon;

import java.util.Scanner;

public class GeekAndCoffeeShop {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0; i<T; i++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            for(int j=0; j<M-1; j++) {
                N/=2;
            }
            System.out.println(N);
        }
    }
}