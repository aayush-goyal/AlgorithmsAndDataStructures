/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class GreedyPuppy {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            int max=0;
            
            for(int j=1; j<=k; j++) {
                if(n%j>max) {
                    max=n%j;
                }
            }
            
            System.out.println(max);
        }
    }
}