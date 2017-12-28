package CompetitiveCoding.Codechef.Beginner;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

class SimpleStatistics {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        DecimalFormat df=new DecimalFormat("#.000000");
        for(int i=0; i<noc; i++) {
           int noe=scanner.nextInt();
           int noetr=scanner.nextInt();
           int array[]=new int[noe];
           for(int j=0; j<noe; j++) {
               array[j]=scanner.nextInt();
           }
           Arrays.sort(array);
           double sum=0;
           for(int j=noetr; j<noe-noetr; j++) {
               sum+=array[j];
           }
           double avg=sum/(noe-(2*noetr));
           System.out.println(df.format(avg));
        }
    }
}