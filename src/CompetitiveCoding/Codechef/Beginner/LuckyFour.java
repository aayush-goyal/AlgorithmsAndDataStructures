package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class LuckyFour {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            String num=scanner.next();
            int len=num.length();
            int sum=0;
            for(int j=0; j<len; j++) {
                if(num.charAt(j)=='4') {
                    sum+=1;
                }
            }
            System.out.println(sum);
        }
    }
}