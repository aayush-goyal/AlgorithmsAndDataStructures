package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class ATM {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int c;
        double initbal, wc;
        c=scanner.nextInt();
        wc=c*1.00;
        initbal=scanner.nextDouble();
        if(initbal>=wc+0.50 && wc%5==0) {
            System.out.printf("%.2f", (double)(initbal-wc-0.50));
        } else {
            System.out.printf("%.2f", initbal);
        }
        
    }
}