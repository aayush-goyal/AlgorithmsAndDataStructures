package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class ChefAndRemissness {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if(a>b) {
                System.out.print(a + " ");
            } else {
                System.out.print(b + " ");
            }
            System.out.println(a+b);
        }
    }
}