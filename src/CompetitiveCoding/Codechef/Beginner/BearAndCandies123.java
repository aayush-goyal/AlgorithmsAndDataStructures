package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class BearAndCandies123 {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            boolean winner=false, winnerA=false;
            int j=1, A=scanner.nextInt(), B=scanner.nextInt();
            
            while(!winner) {
                if(j%2==0) {
                    B-=j;
                    if(B<0) {
                        winnerA=true;
                        break;
                    }
                    j++;
                } else {
                    A-=j;
                    if(A<0) {
                        break;
                    }
                    j++;
                }
            }
            
            if(winnerA) {
                System.out.println("Limak");
            } else {
                System.out.println("Bob");
            }
        }
    }
}