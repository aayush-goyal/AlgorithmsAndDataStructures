package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class ChefAndDigits {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
           String number=scanner.next();
           int zero=0, one=0;
           for(int j=0; j<number.length(); j++) {
               if(number.charAt(j)=='0') {
                   zero++;
               } else if(number.charAt(j)=='1') {
                   one++;
               }
           }
           if(zero==1 || one==1) {
               System.out.println("Yes");
           } else {
               System.out.println("No");
           }
        }
    }
}