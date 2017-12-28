package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class CielAndReceipt {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int sum=scanner.nextInt();
            int psum=sum, mnom=0, j;
            while(sum>0) {
                j=0;
                while(psum>0) {
                    psum/=2;
                    j++;
                    if(j==12) {
                        break;
                    }
                }
                sum-=Math.pow(2, j-1);
                psum=sum;
                mnom++;
            }
            System.out.println(mnom);
        }
    }
}