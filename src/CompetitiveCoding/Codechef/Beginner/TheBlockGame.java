package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class TheBlockGame {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            String num=scanner.next();
            StringBuffer one=new StringBuffer(num);
            StringBuffer two=one.reverse();
            String reverse=two.toString();
            if(num.equals(reverse)) {
                System.out.println("wins");
            } else {
                System.out.println("losses");
            }         
        }
    }
}