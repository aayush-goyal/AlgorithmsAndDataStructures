package CompetitiveCoding.Hackerearth.BasicProgramming;

import java.io.*;

public class PlayWithNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] NQ = br.readLine().split(" ");
            int N = Integer.parseInt(NQ[0]), Q = Integer.parseInt(NQ[1]);
            String[] arr = br.readLine().split(" ");
            long array[] = new long[arr.length];
            for(int i=0; i<arr.length; i++) {
                array[i] = Long.parseLong(arr[i]);
            }

            for(int j=0; j<Q; j++) {
                String[] LR = br.readLine().split(" ");
                int L = Integer.parseInt(LR[0]), R = Integer.parseInt(LR[1]);
                long mean = 0;
                for(int i=L-1; i<R; i++) {
                    mean += array[i];
                }

                mean /= (R-L+1);
                System.out.println((long)Math.floor(mean));
            }
        } catch (IOException ioe) {
            System.out.println("Some error occurred.");
        }
    }
}