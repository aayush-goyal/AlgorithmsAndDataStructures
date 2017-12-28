package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class LifeTheUniverseEverything {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int a;
        do {
            a=scanner.nextInt();
            if(a!=42 && a>-100 && a<100) {
                System.out.println(a);
            }
        } while (a!=42 && a>-100 && a<100);
    }
}