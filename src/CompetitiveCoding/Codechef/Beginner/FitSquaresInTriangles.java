package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class FitSquaresInTriangles {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int b=scanner.nextInt();
            int c=b/2;
            System.out.println((((c*c)-c)/2));
        }
    }
}