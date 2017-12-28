package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class NothingInCommon {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int n1=scanner.nextInt();
            int n2=scanner.nextInt();
            int a[]=new int[n1];
            int b[]=new int[n2];
            
            for(int j=0; j<n1; j++) {
                a[j]=scanner.nextInt();
            }
            
            for(int j=0; j<n2; j++) {
                b[j]=scanner.nextInt();
            }
        }
    }
}