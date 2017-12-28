package CompetitiveCoding.Hackerrank.Compete.WeekOfCode33;

import java.io.*;

public class TwinArrays {
    public static void main(String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String a[] = br.readLine().split(" "), b[] = br.readLine().split(" ");
            int A[] = new int[n], B[] = new int[n], indexA, minA1, minA2, indexB, minB1, minB2, min;

            for(int i=0; i<n; i++) {
                A[i] = Integer.parseInt(a[i]);
                B[i] = Integer.parseInt(b[i]);
            }

            indexA = indexB = 0;
            minA1 = minA2 = A[0];
            minB1 = minB2 = B[0];

            for(int i=1; i<n; i++) {
                if (A[i] < minA1) {
                    indexA = i;
                    minA1 = A[i];
                }

                if(B[i]<minB1 && indexB != indexA) {
                    indexB = i;
                    minB1 = B[i];
                }
            }

            for(int i=1; i<n; i++) {
                if (B[i] < minB1) {
                    indexB = i;
                    minB1 = B[i];
                }

                if(A[i]<minA1 && indexA != indexB) {
                    indexA = i;
                    minA1 = A[i];
                }
            }

            if(minA1+minB1>minA2+minB2) {
                min = minA2 + minB2;
            } else {
                min = minA1 + minB1;
            }

            System.out.println(min);
        } catch (IOException ioe) {
            System.out.println("Unexpected error occurred");
        }
    }
}
