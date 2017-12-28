/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class Cupcakes {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int cupcakes=scanner.nextInt();
            if(cupcakes%2==0) {
                System.out.println((cupcakes/2)+1);
            } else {
                System.out.println(((cupcakes-1)/2)+1);
            }
        }
    }
}
