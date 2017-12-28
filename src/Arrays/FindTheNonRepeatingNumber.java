package Arrays;

import java.io.*;

public class FindTheNonRepeatingNumber {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] array = br.readLine().split(" ");
            int[] A = new int[array.length];

            for(int i=0; i<A.length; i++) {
                A[i] = Integer.parseInt(array[i]);
            }
            int XOR = A[0];
            for(int i=1; i<A.length; i++) {
                XOR ^= A[i];
            }

            System.out.println(XOR);
        } catch(IOException ioe) {
            System.out.println("Unexpected error");
        }
    }
}