package Arrays;

import java.io.*;

public class KadanesAlgorithm {
    public static void main(String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] array = br.readLine().split(" ");
            int[] A = new int[array.length];

            for(int i=0; i<A.length; i++) {
                A[i] = Integer.parseInt(array[i]);
            }

            int maximum = Integer.MIN_VALUE, maximumEnding = 0, startIndex = 0, endIndex = 0;

            for(int i=0; i<A.length; i++) {
                maximumEnding = maximumEnding + A[i];
                // Instead of adding a negative value to a probable next positive value element it is better to have that positive value
                // alone.
                if(maximumEnding < 0) {
                    maximumEnding = 0;
                    startIndex = i+1;
                }
                if(maximum < maximumEnding) {
                    maximum = maximumEnding;
                    endIndex = i;
                }
            }

            System.out.println("Largest subarray sum: " + maximum);
            System.out.println("Largest subarray sum starting index: " + startIndex);
            System.out.println("Largest subarray sum ending index: " + endIndex);
        } catch(IOException ioe) {
            System.out.println("Unexpected error");
        }
    }
}