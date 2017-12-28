/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class IDAndShip {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            String id=scanner.next();
            switch(id) {
                case "B":
                    System.out.println("BattleShip");
                    break;
                case "b":    
                    System.out.println("BattleShip");
                    break;
                case "C":    
                    System.out.println("Cruiser");
                    break;    
                case "c":    
                    System.out.println("Cruiser");
                    break;
                case "D":    
                    System.out.println("Destroyer");
                    break;
                case "d":    
                    System.out.println("Destroyer");
                    break;   
                case "F":    
                    System.out.println("Frigate");
                    break;
                case "f":    
                    System.out.println("Frigate");
                    break;
            }
        }
    }
}