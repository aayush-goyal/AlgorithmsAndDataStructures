package CompetitiveCoding.Codechef.Beginner;

import java.util.*;

class SimilarDishes {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int count=0;
            String dish1[]=new String[4];
            String dish2[]=new String[4];
            
            for(int j=0; j<4; j++) {
                dish1[j]=scanner.next();
            }
            
            for(int j=0; j<4; j++) {
                dish2[j]=scanner.next();
            }
            
            for(int j=0; j<4; j++) {
                for(int k=0; k<4; k++) {
                    if(dish1[j].equals(dish2[k])) {
                        count++;
                    }
                }
            }
            
            if(count>=2) {
                System.out.println("similar");
            } else {
                System.out.println("dissimilar");
            }
            
        }
    }
}