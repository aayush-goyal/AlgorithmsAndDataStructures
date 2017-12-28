/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class CoinsAndTriangle {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int coins=scanner.nextInt();
            int k=1, height=0;
            do {
                coins=coins-k;
                k++;
                height++;
            } while(coins>0);
            System.out.println(height);
        }
    }
}