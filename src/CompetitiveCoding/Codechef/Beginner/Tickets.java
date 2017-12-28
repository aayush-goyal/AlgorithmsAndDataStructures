package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class Tickets {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            boolean ans=true;
            String result, ticket=scanner.next(), temp;
            for(int j=2; j<ticket.length(); j+=2) {
                if(ticket.charAt(j)==ticket.charAt(j-2) && ticket.charAt(j+1)==ticket.charAt(j-1)) {
                    ans=true;
                } else {
                    ans=false;
                    break;
                }
            }
            for(int j=3; j<ticket.length(); j+=2) {
                if(ticket.charAt(j)==ticket.charAt(j-2)) {
                    ans=true;
                } else {
                    ans=false;
                    break;
                }
            }
            
            if(ticket.charAt(0)==ticket.charAt(1)) {
                ans=false;
            }
            
            if(ans) {
                result="YES";
            } else {
                result="NO";
            }
            
            System.out.println(result);
        }
    }
}