/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class TrainPartner {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int bno=scanner.nextInt();
            int temp=bno%8;
            switch(temp) {
                case 0:
                    System.out.println(bno-1+"SL");
                    break;
                case 1:
                    System.out.println(bno+3+"LB");
                    break;
                case 2:
                    System.out.println(bno+3+"MB");
                    break;
                case 3:
                    System.out.println(bno+3+"UB");
                    break;
                case 4:
                    System.out.println(bno-3+"LB");
                    break;
                case 5:
                    System.out.println(bno-3+"MB");
                    break;
                case 6:
                    System.out.println(bno-3+"UB");
                    break;
                case 7:
                    System.out.println(bno+1+"SU");
                    break;
            }
        }
    }
}