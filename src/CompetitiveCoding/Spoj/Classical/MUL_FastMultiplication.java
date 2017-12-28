package CompetitiveCoding.Spoj.Classical;

import java.math.BigInteger;
import java.util.Scanner;

class MUL_FastMultiplication {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        
        for(int i=0; i<n; i++) {
            BigInteger l1=new BigInteger(scanner.next());
            BigInteger l2=new BigInteger(scanner.next());
            System.out.println(l1.multiply(l2));
        }
    }
}