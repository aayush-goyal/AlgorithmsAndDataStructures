package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class MakeXORZero {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int num=scanner.nextInt();
            int one=0, zero=0, xor=0;
            for(int j=0; j<num; j++) {
                int number=scanner.nextInt();
                if(number==0) {
                    zero++;
                } else {
                    one++;
                }
            }
            if(one>zero) {
                System.out.println(zero);
            } else {
                System.out.println(one);
            }
        }
    }
}
