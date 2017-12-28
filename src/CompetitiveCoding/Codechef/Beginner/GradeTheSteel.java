package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class GradeTheSteel {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int h=scanner.nextInt();
            double ccm=scanner.nextDouble();
            int tsm=scanner.nextInt();
            
            if(h>50 && ccm<0.7 && tsm>5600) {
                System.out.println("10");
            } else if(h>50 && ccm<0.7) {
                System.out.println("9");
            } else if(ccm<0.7 && tsm>5600) {
                System.out.println("8");
            } else if(h>50 && tsm>5600) {
                System.out.println("7");
            } else if(h>50 || ccm<0.7 || tsm>5600) {
                System.out.println("6");
            } else {
                System.out.println("5");
            }   
        }
    }
}