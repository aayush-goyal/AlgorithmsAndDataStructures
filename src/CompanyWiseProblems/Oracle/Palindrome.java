package CompanyWiseProblems.Oracle;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            String number = scanner.next();
            StringBuilder reverse = new StringBuilder(number);
            reverse.reverse();

            if(reverse.toString().equals(number)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}