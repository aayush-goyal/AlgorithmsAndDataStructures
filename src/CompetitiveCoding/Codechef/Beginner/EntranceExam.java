package CompetitiveCoding.Codechef.Beginner;

import java.util.*;

class EntranceExam {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int sergeymarks=0;
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            int e=scanner.nextInt();
            int m=scanner.nextInt();
            int arr[]=new int[n-1];
            
            for(int j=0; j<n-1; j++) {
                int totalmarks=0;
                for(int a=0; a<e; a++) {
                    totalmarks+=scanner.nextInt();
                }
                arr[j]=totalmarks;
            }
            
            Arrays.sort(arr);
                       
            int min=arr[n-k-1];
            
            for(int j=0; j<n-1; j++) {
                System.out.println(arr[j]);
            }
            
            for(int j=0; j<e-1; j++) {
                sergeymarks+=scanner.nextInt();
            }
            int req=min-sergeymarks+1;
            
            System.out.println(min+" "+req+" "+sergeymarks);
            
            if (req>m) {
                System.out.println("Impossible");
            } else {
                if(req<=0) {
                    System.out.println(0);
                } else {
                    System.out.println(req);
                }
            }
            
        }
    }
}