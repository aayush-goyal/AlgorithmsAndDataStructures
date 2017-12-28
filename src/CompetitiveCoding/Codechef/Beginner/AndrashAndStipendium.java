package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class AndrashAndStipendium {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int exams=scanner.nextInt();
            int sum=0, score=0;
            double avg=0;
            boolean full=false;
            for(int j=0; j<exams; j++) {
                score=scanner.nextInt();
                sum+=score;
                if(score==5) {
                    full=true;
                } else if(score<=2) {
                    full=false;
                    break;
                }
            }
            avg=sum/exams;
            if(avg>=4.0 && full) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}