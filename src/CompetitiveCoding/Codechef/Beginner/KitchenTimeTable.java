/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class KitchenTimeTable {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int children=scanner.nextInt();
            int s=0;
            int A[]=new int[children];
            int B[]=new int[children];
            for(int j=0; j<children; j++) {
                A[j]=scanner.nextInt();
            }
            
            for(int j=0; j<children; j++) {
                B[j]=scanner.nextInt();
            }
            
            if(A[0]>=B[0]) {
                s++;
            }
            for(int j=1; j<children; j++) {
                if((A[j]-A[j-1])>=B[j]) {
                    s++;
                }
            }
            
            System.out.println(s);
        }
    }
}