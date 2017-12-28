/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Hackerrank.Java;

import java.util.Scanner;

public class Loops1 {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=1; i<11; i++) {
            System.out.println(num + " X " + i + " = "  + num*i);
        }
    }
    
}
