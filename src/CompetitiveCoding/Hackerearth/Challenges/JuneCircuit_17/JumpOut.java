package CompetitiveCoding.Hackerearth.Challenges.JuneCircuit_17;

import java.io.*;

public class JumpOut {
    public static void main(String[] args) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()), booster[] = new int[N], jump = 0;

            String[] nums = br.readLine().split(" ");
            for(int i = 0; i<nums.length; i++) {
                booster[i] = Integer.parseInt(nums[i]);
            }

            for(int i = 0; i<N; i++) {
                jump = i+1;
                int boosterPower = booster[i];
                if((boosterPower+jump)-(N+1) >= 0) {
                    break;
                }
            }

            System.out.println(jump);
        } catch (IOException ioe) {
            System.out.println("Unexpected error occurred.");
        }
    }
}