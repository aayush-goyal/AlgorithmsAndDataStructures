/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.Hackerearth.BasicProgramming;

import java.util.Scanner;
import java.util.regex.Pattern;

class ToggleString {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.next(), result = "";

        for(int i=0; i<test.length(); i++) {
            if(Pattern.matches("[A-Z]", Character.toString(test.charAt(i)))) {
                result = result.concat(Character.toString(test.charAt(i)).toLowerCase());
            } else {
                result = result.concat(Character.toString(test.charAt(i)).toUpperCase());
            }
        }

        System.out.println(result);
    }
}