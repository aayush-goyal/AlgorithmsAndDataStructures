package CompetitiveCoding.Hackerearth.BasicProgramming;

import java.util.Scanner;

class Factorial {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int fact=1;
        for(int i=0; i<number; i++) {
            fact*=(i+1);
        }
        System.out.println(fact);
    }
}