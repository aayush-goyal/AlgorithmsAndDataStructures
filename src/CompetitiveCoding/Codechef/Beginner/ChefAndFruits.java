/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class ChefAndFruits {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int N=scanner.nextInt();
            int M=scanner.nextInt();
            int K=scanner.nextInt();
            if(N>M) {
                if(N-M<=K) {
                    System.out.println(0);
                } else {
                    System.out.println(N-M-K);
                }
            } else {
                if(M-N<=K) {
                    System.out.println(0);
                } else {
                    System.out.println(M-N-K);
                }
            }
        }
    }
}