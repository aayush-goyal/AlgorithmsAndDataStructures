/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class DrumpfThePresident {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int govtsize=0;
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            int vote[]=new int[n];
            int nov[]=new int[n];
            for(int j=0; j<n; j++) {
                int vot=scanner.nextInt();
                if(vot==j+1) {
                    vote[j]=-1;
                }
                
                if(vote[j]==-1) {
                    
                } else {
                    vote[vot-1]+=1;
                }
            }
            
            for(int j=0; j<n; j++) {
                if(vote[j]>k) {
                    govtsize+=1;
                }
            }
            
            System.out.println(govtsize);
        }
    }
}