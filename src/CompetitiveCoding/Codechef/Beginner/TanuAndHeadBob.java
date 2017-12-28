/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class TanuAndHeadBob {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int num=scanner.nextInt();
            String gest=scanner.next();
            int truth=0;
            for(int j=0; j<gest.length(); j++) {
                if(gest.charAt(j)=='Y') {
                    System.out.println("NOT INDIAN");
                    truth=0;
                    break;
                } else if(gest.charAt(j)=='I') {
                    System.out.println("INDIAN");
                    truth=1;
                    break;
                } else {
                    truth=2;
                }
            }
            
            if(truth==2) {
                System.out.println("NOT SURE");
            }
        }
    }
}