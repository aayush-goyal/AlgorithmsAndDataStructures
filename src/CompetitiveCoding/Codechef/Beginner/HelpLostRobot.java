package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class HelpLostRobot {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int x1=scanner.nextInt();
            int y1=scanner.nextInt();
            int x2=scanner.nextInt();
            int y2=scanner.nextInt();
            
            if(x1!=x2 && y1!=y2) {
                System.out.println("sad");
                continue;
            }
            
            if(x1==x2) {
                if(y2>y1) {
                    System.out.println("up");
                    continue;
                } else {
                    System.out.println("down");
                    continue;
                }
            }
            
            if(y1==y2) {
                if(x2>x1) {
                    System.out.println("right");
                } else {
                    System.out.println("left");
                }
            }
        }
    }
}