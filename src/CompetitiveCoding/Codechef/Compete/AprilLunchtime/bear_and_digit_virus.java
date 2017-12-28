package CompetitiveCoding.Codechef.Compete.AprilLunchtime;

import java.util.Scanner;

class bear_and_digit_virus {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            String sample=scanner.next();
            int sampleArray[]=new int[sample.length()];
            for(int j=0; j<sample.length(); j++) {
                sampleArray[j]=sample.charAt(j);
            }
        }
    }
}
