/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class ChefAndColoring {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int rooms=scanner.nextInt();
            String paint=scanner.next();
            int R=0, G=0, B=0;
            for(int j=0; j<rooms; j++) {
                char p=paint.charAt(j);
                switch(p) {
                    case 'R':
                        R++;
                        break;
                    case 'G':
                        G++;
                        break;
                    case 'B':
                        B++;
                        break;
                    default:
                        break;
                }
            }
            if(R>G) {
                if(R>B) {
                    System.out.println(G+B);
                } else {
                    System.out.println(R+G);
                }
            } else {
                if(G>B) {
                    System.out.println(R+B);
                } else {
                    System.out.println(R+G);
                }
            }
        }
    }
}