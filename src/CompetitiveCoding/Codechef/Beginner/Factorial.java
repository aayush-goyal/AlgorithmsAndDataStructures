package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class Factorial {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int zero=0, temp=0;
            int num=scanner.nextInt();
            for(int j=1; temp<num; j++) {
                temp=(int)Math.pow(5, j);
                zero+=num/temp;
            }
            System.out.println(zero);
        }
    }
}