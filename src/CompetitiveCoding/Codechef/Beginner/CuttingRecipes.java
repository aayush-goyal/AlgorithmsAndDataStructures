package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class CuttingRecipes {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int noi=scanner.nextInt();
            int arr[]=new int[noi];
            for(int j=0; j<noi; j++) {
                arr[j]=scanner.nextInt();
            }
            
            int gcd = arr[0];
            for(int j = 1; j < noi; j++) { 
                gcd = GCD(gcd, arr[j]);
            }
            
            for(int j=0; j<noi; j++) {
                System.out.print(arr[j]/gcd+" ");
            }
            System.out.println();
        }
    }
   
    static int GCD(int a, int b) {
        if (b==0) return a;
        return GCD(b,a%b);
    }
}