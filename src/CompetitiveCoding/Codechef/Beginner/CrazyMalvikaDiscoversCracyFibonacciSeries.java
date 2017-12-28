package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class CrazyMalvikaDiscoversCracyFibonacciSeries {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int A=scanner.nextInt();
            int B=scanner.nextInt();
            int N=scanner.nextInt();
            
            System.out.println(fibonacciNumber(N, A, B));
        }
    }
    
    static int fibonacciNumber(int N, int A, int B) {
        if(N==3) {
            return B-A;
        } else {
            return fibonacciNumber(N-1, A, B);
        }
    }
}
