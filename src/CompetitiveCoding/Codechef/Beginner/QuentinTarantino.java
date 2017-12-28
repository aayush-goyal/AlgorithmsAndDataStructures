package CompetitiveCoding.Codechef.Beginner;

import java.util.*;

class QuentinTarantino {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int noch=scanner.nextInt();
            int charr[]=new int[noch];
            boolean is_querentin=true;
            for(int j=0; j<noch; j++) {
                charr[j]=scanner.nextInt();
            }
            
            int charrsort[]=Arrays.copyOfRange(charr, 0, noch);
            Arrays.sort(charrsort);
            
            if(Arrays.equals(charr, charrsort)) {
                System.out.println("no");
                continue;
            }
            
            for(int j=0; j<noch; j++) {
                if(charrsort[j]!=j+1) {
                    is_querentin=false;
                }
            }
            
            if(is_querentin) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            
        }
    }    
}