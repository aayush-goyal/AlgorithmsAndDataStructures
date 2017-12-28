package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class ChefAndOperators {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();
            if(num1>num2) {
                System.out.println(">");
            } else if(num1<num2) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
    }
}