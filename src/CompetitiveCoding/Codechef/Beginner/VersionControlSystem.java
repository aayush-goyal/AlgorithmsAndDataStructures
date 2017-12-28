/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class VersionControlSystem {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int nof=scanner.nextInt();
            int noif=scanner.nextInt();
            int notf=scanner.nextInt();
            int one=0, two=0;
            int noifa[]=new int[nof];
            int notfa[]=new int[nof];
            
            for(int j=0; j<noif; j++) {
                int ig=scanner.nextInt();
                noifa[ig-1]=ig;
            }
            
            for(int j=0; j<notf; j++) {
                int tr=scanner.nextInt();
                notfa[tr-1]=tr;
            }
            
            for(int j=0; j<nof; j++) {
                if(noifa[j]==0 && notfa[j]==0) {
                    two++;
                } else if(noifa[j]==notfa[j] && notfa[j]!=0) {
                    one++;
                }
            }
            
            System.out.println(one + " " + two);
        }
    }
}