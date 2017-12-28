package CompetitiveCoding.Spoj.Basics;

import java.util.Scanner;

class STRHH_HalfOfTheHalf {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        
        for(int i=0; i<t; i++) {
            String a=scanner.next();
            a=a.substring(0, a.length()/2);
            
            for(int j=0; j<a.length(); j+=2) {
                System.out.print(a.charAt(j));
            }
            System.out.println();
        }
    }
}