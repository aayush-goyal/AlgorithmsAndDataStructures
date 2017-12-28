package CompetitiveCoding.Codechef.Beginner;

import java.util.*;

class AmbiguousPermutations {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int non=scanner.nextInt();
        while(non>0) {
            if(non==0) {
                break;
            }
            int perm[]=new int[non];
            int iperm[]=new int[non];
            for(int j=0; j<non; j++) {
                perm[j]=scanner.nextInt();
            }
            
            for(int j=0;j<non;j++){
                iperm[perm[j]-1]=(j+1);
            }
            
            if(Arrays.equals(perm, iperm)) {
                System.out.println("ambiguous");
            } else {
                System.out.println("not ambiguous");
            }
            non=scanner.nextInt();
        }
    }
}