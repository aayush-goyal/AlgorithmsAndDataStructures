package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class LaLiga {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0; i<T; i++) {
            int scores[] = new int[4];
            for(int j=0; j<4; j++) {
                String team = scanner.next();
                switch (team) {
                    case "Barcelona":
                        scores[0]=scanner.nextInt();
                        break;
                    case "RealMadrid":
                        scores[1]=scanner.nextInt();
                        break;
                    case "Malaga":
                        scores[2]=scanner.nextInt();
                        break;
                    case "Eibar":
                        scores[3]=scanner.nextInt();
                        break;
                }

            }

            if(scores[2]>scores[1] && scores[0]>scores[3]) {
                System.out.println("Barcelona");
            } else {
                System.out.println("RealMadrid");
            }

        }

    }
}