package CompetitiveCoding.Codechef.Beginner;

import java.math.BigInteger;
import java.util.Scanner;

class SmallFactorial {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        BigInteger k=BigInteger.valueOf(1), fact=BigInteger.valueOf(1);
        for(int i=0; i<noc; i++) {
        int num=scanner.nextInt();
            for(int j=1; j<=num; j++) {
                fact=multiply(fact, BigInteger.valueOf(j));
            }
            System.out.println(fact);
            fact=BigInteger.valueOf(1);
        }
    }
    
    static BigInteger multiply(BigInteger bigInteger1, BigInteger bigInteger2) {
        BigInteger bigInteger=BigInteger.valueOf(0);
        BigInteger mul=bigInteger1.multiply(bigInteger2);
        return mul;
    }
    
}