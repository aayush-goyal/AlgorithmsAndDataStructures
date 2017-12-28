package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class GrossSalary {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int salary=scanner.nextInt();
            if(salary<1500) {
                System.out.println(2*salary);
            } else {
                System.out.println(salary+500+Math.round((0.98*salary)*10/10));
            }
        }
    }    
}