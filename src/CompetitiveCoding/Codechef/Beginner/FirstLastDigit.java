/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class FirstLastDigit {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            String num=scanner.next();
            int fd=Integer.parseInt(String.valueOf(num.charAt(0)));
            int ld=Integer.parseInt(String.valueOf(num.charAt(num.length()-1)));
            System.out.println(fd+ld);
        }
    }
}