package CompetitiveCoding.Spoj.Classical;

import java.math.BigInteger;
import java.util.Scanner;

class PALIN_TheNextPalindrome {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        
        for(int i=0; i<t; i++) {
            String num=scanner.next();
            BigInteger number=new BigInteger(num), j=number.add(BigInteger.ONE);
            while(!checkPalindrome(j)) {
                j=j.add(BigInteger.ONE);
            }
            System.out.println(j);
        }
    }
    
    static boolean checkPalindrome(BigInteger number) {
        String num=number.toString();
        String reverseNum=new StringBuilder(num).reverse().toString();
        return num.equals(reverseNum);
    }
}