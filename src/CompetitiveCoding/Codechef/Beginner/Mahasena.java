package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class Mahasena {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int nos=scanner.nextInt(), even=0, odd=0;
        for(int i=0; i<nos; i++) {
            int now=scanner.nextInt();
            if(now%2==0) {
                even++;
            } else {
                odd++;
            }
            
        }
        if(even>odd) {
                System.out.println("READY FOR BATTLE");
            } else {
                System.out.println("NOT READY");
            }
    }
}