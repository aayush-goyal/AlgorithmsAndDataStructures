/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class EnormousInputTest {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        int divisor=scanner.nextInt(), sc=0;
        for(int i=0; i<noc; i++) {
            if(scanner.nextInt()%divisor==0) {
                sc+=1;
            }
        }
        System.out.println(sc);
    }
}