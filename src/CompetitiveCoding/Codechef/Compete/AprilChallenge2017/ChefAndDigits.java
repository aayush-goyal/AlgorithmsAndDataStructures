package CompetitiveCoding.Codechef.Compete.AprilChallenge2017;

import java.util.Scanner;

class ChefAndDigits {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            long L=scanner.nextLong();
            long R=scanner.nextLong();
            long count=0;
            int a[]=new int[10], b[]=new int[10];
            
            for(int j=0; j<10; j++) {
                a[j]=scanner.nextInt();
            }
            
            for(long j=L; j<R+1; j++) {
                for(int k=0; k<10; k++) {
                    int occ=recurseCountDigits(j, k);
                    if(occ==a[k]) {
                        count--;
                        break;
                    }
                }
                count++;
            }
            
            System.out.println(count);
        }
    }
    
    static int recurseCountDigits(long number, int digit){
        if(number < 10) {
            return number == digit ? 1 : 0;
        } else {
            if(number%10 == digit) {
                return 1 + recurseCountDigits(number/10, digit);
            } else {
                return recurseCountDigits(number/10, digit);
            }
        }
    }
}