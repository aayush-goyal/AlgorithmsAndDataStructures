package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class DownloadFile {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int N=scanner.nextInt();
            int K=scanner.nextInt();
            int R=0;
            for(int j=0; j<N; j++) {
                int T=scanner.nextInt();
                int D=scanner.nextInt();
                if (K!=0) {
                    if(K<=T){
                        T=T-K;
                        K=0;
                    } else {
                        K=K-T;
                        T=0;
                        continue;
                    }
                }
                
                R+=T*D;
            }
            System.out.println(R);
        }
    }
}