package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class XennyAndAlternatingTasks {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int not=scanner.nextInt();
            int X[]=new int[not];
            int Y[]=new int[not];
            int sX1=0, sX2=0, sY1=0, sY2=0, s1=0, s2=0;
            
            for(int j=0; j<not; j++) {
                X[j]=scanner.nextInt();
            }
            
            for(int j=0; j<not; j++) {
                Y[j]=scanner.nextInt();
            }
            
            for(int j=0; j<not; j+=2) {
                sX1+=X[j];
            }
            for(int j=1; j<not; j+=2) {
                sY1+=Y[j];
            }
            
            for(int j=1; j<not; j+=2) {
                sX2+=X[j];
            }
            for(int j=0; j<not; j+=2) {
                sY2+=Y[j];
            }
            
            s1=sX1+sY1;
            s2=sX2+sY2;
            
            if(s1>s2) {
                System.out.println(s2);
            } else {
                System.out.println(s1);
            }
        }
    }
}