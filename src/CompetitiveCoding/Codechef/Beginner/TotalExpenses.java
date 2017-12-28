package CompetitiveCoding.Codechef.Beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

class TotalExpenses {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        DecimalFormat df=new DecimalFormat("#.000000");
        for(int i=0; i<noc; i++) {
            int quantity=scanner.nextInt(), price=scanner.nextInt();
            double total=quantity*price;
            if(quantity>1000) {
                System.out.println(df.format(0.9*total));
            } else {
                System.out.println(df.format(total));
            }
        }
    }
}