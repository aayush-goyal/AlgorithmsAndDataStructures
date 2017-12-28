/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class SumOfPalindromicNumbers {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int fn=scanner.nextInt(), ln=scanner.nextInt();
            int sum=0;
            for(int j=fn; j<ln+1; j++) {
                String num=String.valueOf(j);
                String reverse=new StringBuffer(num).reverse().toString();
                if(num.equals(reverse)) {
                    sum+=j;
                }
            }
            System.out.println(sum);
        }
    }
}