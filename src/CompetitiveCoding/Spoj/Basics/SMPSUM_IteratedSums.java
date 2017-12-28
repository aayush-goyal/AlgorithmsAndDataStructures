package CompetitiveCoding.Spoj.Basics;

import java.io.*;

class SMPSUM_IteratedSums {
    public static void main (String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String ab[] = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            int iteratedSum = 0;

            for(int j=a; j<b+1; j++) {
                iteratedSum += (j*j);
            }

            System.out.println(iteratedSum);

        } catch (IOException ioe) {
            System.out.println("Unexpected error occurred.");
        }
    }
}