package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class GCDAndLCM {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int gcd=gcd(a, b);
        System.out.println(gcd+" "+(a*b/gcd(a, b)));
        }
    }

    static int gcd(int a, int b) {
        while (b>0) {
            int temp=b;
            b=a%b; // % is remainder
            a=temp;
        }
        return a;
    }

}