/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class SumOfDigits {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        int sum=0;
        for(int i=0; i<noc; i++) {
            String num=scanner.next();
            for(int j=0; j<num.length(); j++) {
                int k=Integer.parseInt(String.valueOf(num.charAt(j)));
                sum+=k;
            }
            System.out.println(sum);
            sum=0;
        }
    }
}