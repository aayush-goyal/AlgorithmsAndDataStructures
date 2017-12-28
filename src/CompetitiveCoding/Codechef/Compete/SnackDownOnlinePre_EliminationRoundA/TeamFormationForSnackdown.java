package CompetitiveCoding.Codechef.Compete.SnackDownOnlinePre_EliminationRoundA;

import java.util.Scanner;

class TeamFormationForSnackdown {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0; i<T; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            for(int j=0; j<2*m; j++) {
                scanner.nextInt();
            }

            if((n-(2*m))%2==0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}