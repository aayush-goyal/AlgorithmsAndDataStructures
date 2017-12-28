package CompetitiveCoding.Codechef.Compete.AprilChallenge2017;

import java.util.*;

class StableMarket {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int N=scanner.nextInt(), Q=scanner.nextInt(), stockPrices[]=new int[N];
            
            for(int j=0; j<N; j++) {
                stockPrices[j]=scanner.nextInt();
            }
            
            for(int j=0; j<Q; j++) {
                int L=scanner.nextInt();
                int R=scanner.nextInt();
                int K=scanner.nextInt();
                
                System.out.println(numberOfStableBlocks(stockPrices, L, R, K));
            }
        }
    }
    
    static int numberOfStableBlocks(int array[], int L, int R, int K) {
        int order=1, number=0;
        for(int i=L; i<R; i++) {
            if(array[i]==array[i-1]) {
                order++;
            } else {
                if(order>=K) {
                    number++;
                }
                order=1;
            }
        }
        
        if(order>=K) {
            number++;
        }
        
        return number;       
    }
}