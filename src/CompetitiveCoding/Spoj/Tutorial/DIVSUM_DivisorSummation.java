package CompetitiveCoding.Spoj.Tutorial;

import java.util.Scanner;

class DIVSUM_DivisorSummation {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        
        for(int i=0; i<t; i++) {
            int num=scanner.nextInt(), sum=0;
            
            for(int j=1; j<=num/2; j++) {
                if(num%j==0) {
                    sum+=j;
                }
            }
            
            System.out.println(sum);
        }
    }
}