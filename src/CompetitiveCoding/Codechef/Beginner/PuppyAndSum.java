package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class PuppyAndSum {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int D=scanner.nextInt();
            int N=scanner.nextInt();
            int sum=0;
            for(int j=0; j<D; j++) {
                sum=(N*(N+1))/2;
                N=sum;
            }
            System.out.println(sum);
        }
    }
}