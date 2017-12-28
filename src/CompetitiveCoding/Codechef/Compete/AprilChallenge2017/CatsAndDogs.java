package CompetitiveCoding.Codechef.Compete.AprilChallenge2017;

import java.util.Scanner;

class CatsAndDogs {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int C=scanner.nextInt();
            int D=scanner.nextInt();
            int L=scanner.nextInt();
            int min, max;
            if(L%4!=0) {
                System.out.println("no");
                break;
            }
            if(C>2*D) {
                min=(D+(C-(D*2)))*4;
                max=(C+D)*4;
            } else {
                min=D*4;
                max=(C+D)*4;
            }
            if(L>=min && L<=max) {
               System.out.println("yes");
            } else {
               System.out.println("no");
            }
        }
    }
}