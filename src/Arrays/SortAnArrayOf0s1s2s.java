package Arrays;

import java.io.*;

public class SortAnArrayOf0s1s2s {
    public static void main(String[] args) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String numbers[] = br.readLine().split(" ");
            int[] nums = new int[numbers.length];
            for(int i=0; i<nums.length; i++) {
                nums[i] = Integer.parseInt(numbers[i]);
            }

            int start = 0, end = nums.length;

            for(int i=0; i<nums.length; i++) {
                if(nums[i] == 0) {
                    // nums[start] == nums[i];
                }
            }
        } catch (IOException ioe) {
            System.out.println("Unexpected error");
        }
    }
}
