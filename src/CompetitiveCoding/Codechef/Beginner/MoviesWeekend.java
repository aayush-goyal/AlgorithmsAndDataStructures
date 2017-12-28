package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class MoviesWeekend {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        int l[], r[], mul;
        for(int i=0; i<noc; i++) {
            int col=scanner.nextInt();
            l=new int[col];
            r=new int[col];
            for(int j=0; j<col; j++) {
                l[j]=scanner.nextInt();
            }
            for(int j=0; j<col; j++) {
                r[j]=scanner.nextInt();
            }
            
            int max=l[0]*r[0], index=0;
            for(int j=1; j<col; j++) {
                if(l[j]*r[j]>max){
                    max=l[j]*r[j];
                    index=j;
                }
                else if(l[j]*r[j]==max) {
                    if(r[index]>=r[j]){
                        index=index;
                    } else {
                        index=j;
                    }
                }
            }
            System.out.println(index+1);
        }
    }    
}