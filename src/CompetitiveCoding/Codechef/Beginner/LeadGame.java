package CompetitiveCoding.Codechef.Beginner;

import java.util.Arrays;
import java.util.Scanner;

class LeadGame {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        int a=0, b=0;
        int lead[]=new int[noc];
        String winner[]=new String[noc];
        for(int i=0; i<noc; i++) {
            a+=scanner.nextInt();
            b+=scanner.nextInt();
            if(a>b) {
                winner[i]="1";
                lead[i]=a-b;
            } else {
                winner[i]="2";
                lead[i]=b-a;
            }
        }
            
        int max=Arrays.stream(lead).max().getAsInt();
        int ind=maxIndex(lead);
        System.out.println(winner[ind]+" "+max);
    }
    
    static int maxIndex(int[] array) {
        int index=0, largest=array[0];
        for(int j=0; j<array.length; j++) {
            if(array[j]>largest) {
                largest=array[j];
                index=j;
            }
        }
        return index;
    }
}