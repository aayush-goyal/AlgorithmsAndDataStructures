/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class ForgottenLanguages {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int N=scanner.nextInt();
            int K=scanner.nextInt();
            String[] fgt;
            for(int j=0; j<N; j++) {
                fgt=new String[N];
                String fgtLang=scanner.next();
                fgt[j]=fgtLang;
                System.out.println(fgt[j]);
            }
            
            for(int j=0; j<K; j++) {
                int I=scanner.nextInt();
                String lang[];
                for(int a=0; a<I; a++) {
                    lang=new String[I];
                    String langphr=scanner.next();
                    lang[j]=langphr;
                    System.out.println(lang[j]);
                }
            }
            
            for(int j=0; j<N; j++) {
                
            }
        }
    }
    
    static String search(String fgtLang, String lang[]) {
        return "YES";
    }
}