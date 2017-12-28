package CompetitiveCoding.Codechef.Beginner;

import java.util.Arrays;
import java.util.Scanner;

class TurboSort {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noe=scanner.nextInt();
        int array[]=new int[noe];
        for(int i=0; i<noe; i++) {
           array[i]=scanner.nextInt();
        }
        
        Arrays.sort(array);
        
        for(int i=0; i<noe; i++) {
            System.out.println(array[i]);
        }
    }
}