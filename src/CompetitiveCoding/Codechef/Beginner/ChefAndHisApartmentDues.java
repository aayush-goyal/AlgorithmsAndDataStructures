package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class ChefAndHisApartmentDues {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int nom=scanner.nextInt(), noz=0, arr[]=new int[nom], fine=0;
            for(int j=0; j<nom; j++) {
                arr[j]=scanner.nextInt();
            }
            for(int j=0; j<nom; j++) {
                if(arr[j]==0){
                    fine=j;
                    break;
                }
            }
            for(int j=0; j<nom; j++) {
                if(arr[j]==0){
                    noz++;
                }
            }
            System.out.println((noz*1000)+((nom-fine)*100));
        }
    }
}