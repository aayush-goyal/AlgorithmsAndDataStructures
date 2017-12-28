package CompetitiveCoding.Hackerrank.Algorithms;

import java.util.Scanner;

public class BonAppétit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int[] price = new int[n];
        int sum = 0;

        for(int i=0; i<n; i++) {
             price[i] = scanner.nextInt();
        }

        int charged = scanner.nextInt();

        for(int i : price) {
            sum += i;
        }

        int rightCharge = (sum - price[k])/2;

        if(charged == rightCharge)
            System.out.println("Bon Appetit");
        else
            System.out.println(charged - rightCharge);
    }
}