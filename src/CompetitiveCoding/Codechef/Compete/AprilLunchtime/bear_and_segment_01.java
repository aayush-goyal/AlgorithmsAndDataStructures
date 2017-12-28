package CompetitiveCoding.Codechef.Compete.AprilLunchtime;

import java.util.Scanner;

class bear_and_segment_01 {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            String sample=scanner.next();
         
            if(sample.matches("^(([0]*)?)(1+)((0+)?)([1]+)")) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }      
        }
    }
}