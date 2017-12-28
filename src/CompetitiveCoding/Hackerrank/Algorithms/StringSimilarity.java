package CompetitiveCoding.Hackerrank.Algorithms;

import java.util.Scanner;

public class StringSimilarity {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int month1=scanner.nextInt();
        int month2=scanner.nextInt();
        int month3=scanner.nextInt();
        
        int totalRewardPoints=rewardPoints(month1)+rewardPoints(month2)+rewardPoints(month3);
        
        System.out.println(totalRewardPoints);
    }
    
    public static int rewardPoints(int swipes) {
        if(swipes>10) {
            return 100;
        } else {
            return swipes*10;
        }
    }
}