package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class SnapeAndLadder {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int b=scanner.nextInt();
            int ls=scanner.nextInt();
            
            double minrs=Math.sqrt(ls*ls-b*b);
            double maxrs=Math.sqrt(ls*ls+b*b);
            System.out.println(minrs+" "+maxrs);
        }   
    }
}