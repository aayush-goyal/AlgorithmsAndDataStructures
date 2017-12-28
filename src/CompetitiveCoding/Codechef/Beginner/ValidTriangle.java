package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class ValidTriangle {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            int sum=a+b+c;
            if(a!=0 && b!=0 && c!=0 && sum==180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}