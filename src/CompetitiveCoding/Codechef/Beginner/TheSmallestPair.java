package CompetitiveCoding.Codechef.Beginner;

import java.util.*;

class TheSmallestPair {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int sum=0;
            int num=scanner.nextInt();
            int nums[]=new int[num];
            for(int j=0; j<num; j++) {
                nums[j]=scanner.nextInt();
            }
            Arrays.sort(nums);
            sum=nums[0]+nums[1];
            System.out.println(sum);
        }
    }
}