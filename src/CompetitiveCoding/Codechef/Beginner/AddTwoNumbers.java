package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class AddTwoNumbers {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println(a+b);
        }
    }
}