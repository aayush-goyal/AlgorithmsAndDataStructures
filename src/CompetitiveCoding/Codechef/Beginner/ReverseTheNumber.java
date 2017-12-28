package CompetitiveCoding.Codechef.Beginner;

import static java.lang.Math.pow;
import java.util.Scanner;

class ReverseTheNumber {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int num=scanner.nextInt(), finalnum=0, len=String.valueOf(num).length();
            for(int j=1; j<len+1; j++) {
                int k=(int)pow(10, len-j);
                finalnum+=((num%10)*k);
                num=num/10;
            }
            System.out.println(finalnum);
        }
    }
}