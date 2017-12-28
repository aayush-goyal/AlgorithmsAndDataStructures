package CompetitiveCoding.RandomBhakchodi;

import java.util.*;

public class random3 {
    public static void main(String args[]) {
               int t;
        int C,D,L;
        long DLegs,CLegs,minLegs,maxLegs;
 
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
 
        while(t>0)
        {
            C=sc.nextInt();
            D=sc.nextInt();
            L=sc.nextInt();
 
            DLegs=(long)D*4;
            CLegs=(long)(C-(2*D))*4;
            if(CLegs>0)
                minLegs=DLegs+CLegs;
            else
                minLegs=DLegs;
 
            maxLegs=DLegs+(long)(C*4);
            
 
            if((L<minLegs)||(L>maxLegs)||(L%4!=0))
                System.out.println("no");
            else
            {
                System.out.println("yes");
            }
            t--;
        }}
}
