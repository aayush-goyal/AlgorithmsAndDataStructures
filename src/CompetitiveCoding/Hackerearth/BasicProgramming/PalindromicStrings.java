package CompetitiveCoding.Hackerearth.BasicProgramming;

import java.util.Scanner;

class PalindromicStrings {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i)==input.charAt(input.length()-i-1)) {
                
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }   
}