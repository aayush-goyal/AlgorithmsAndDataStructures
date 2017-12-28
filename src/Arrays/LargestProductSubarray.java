package Arrays;

import java.io.*;

public class LargestProductSubarray {
    public static void main(String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] array = br.readLine().split(" ");
            int[] A = new int[array.length];

            for (int i = 0; i < A.length; i++) {
                A[i] = Integer.parseInt(array[i]);
            }
        } catch (IOException ioe) {
            System.out.println("Unexpected error");
        }
    }
}