/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Hackerearth.Algorithms;

import java.util.*;

class MonkTakesAWalk {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            String trees = scanner.next();
            int count=0;

            for (int j = 0; j<trees.length(); j++) {
                if(trees.charAt(j)=='a'||trees.charAt(j)=='A'||trees.charAt(j)=='e'||trees.charAt(j)=='E'
                        ||trees.charAt(j)=='i'||trees.charAt(j)=='I'||trees.charAt(j)=='o'||trees.charAt(j)=='O'||
                        trees.charAt(j)=='u'||trees.charAt(j)=='U') {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
