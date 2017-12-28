package CompetitiveCoding.Codechef.Beginner;

import java.util.Calendar;
import java.util.Scanner;

class GregorianCalendar {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        Calendar cc=Calendar.getInstance();
        for(int i=0; i<noc; i++) {
            int b=scanner.nextInt();
            cc.set(b,0,01);
            int c=cc.get(cc.DAY_OF_WEEK);
            if(c==1)
		System.out.println("sunday");
            else if(c==2)
		System.out.println("monday");
            else if(c==3)
		System.out.println("tuesday");
            else if(c==4)
		System.out.println("wednesday");
            else if(c==5)
		System.out.println("thursday");
            else if(c==6) 
		System.out.println("friday");
            else if(c==7)
		System.out.println("saturday");
        }
    }
}