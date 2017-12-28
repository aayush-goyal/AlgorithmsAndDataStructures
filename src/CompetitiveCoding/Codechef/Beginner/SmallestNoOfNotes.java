package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class SmallestNoOfNotes {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int notes=0;
            int sum=scanner.nextInt();
            notes=sum/100;
            sum=sum%100;
            notes=notes+(sum/50);
            sum=sum%50;
            notes=notes+(sum/10);
            sum=sum%10;
            notes=notes+(sum/5);
            sum=sum%5;
            notes=notes+(sum/2);
            sum=sum%2;
            notes=notes+(sum/1);
            sum=sum%1;
            System.out.println(notes);
        }
    }
}