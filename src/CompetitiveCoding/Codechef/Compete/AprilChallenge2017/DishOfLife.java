package CompetitiveCoding.Codechef.Compete.AprilChallenge2017;

import java.util.*;

class DishOfLife {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            boolean sad=false, some=false, all=false, contribution=false;
            int N=scanner.nextInt();
            int K=scanner.nextInt();
            
            int ing_arr[]=new int[K];
            
            for(int j=0; j<N; j++) {
                int noi=scanner.nextInt();
                boolean arr_contri[]=new boolean[noi];
                for(int k=0; k<noi; k++) {
                    int inum=scanner.nextInt();
                    if(is_already_in_ingarr(inum, ing_arr)) {
                        arr_contri[k]=false;
                    } else {
                        ing_arr[inum-1]=inum;
                        arr_contri[k]=true;
                    }
                }
                for(int k=0; k<noi; k++) {
                    contribution=contribution || arr_contri[k];
                }
                System.out.println(contribution);
                if(contribution) {
                    // Do nothing.
                } else {
                    some=true;
                }
            }
            
            for(int j=0; j<K; j++) {
                if(ing_arr[j]==0) {
                    sad=true;
                    break;
                }
            }
            
            if(sad) {
                System.out.println("sad");
            } else if(some) {
                System.out.println("some");
            } else {
                System.out.println("all");
            }
            
        }
    }
    
    static boolean is_already_in_ingarr(int num, int arr[]) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==num) {
                return true;
            }
        }
        return false;
    }
}