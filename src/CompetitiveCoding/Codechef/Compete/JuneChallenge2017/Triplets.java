package CompetitiveCoding.Codechef.Compete.JuneChallenge2017;

import java.io.*;

public class Triplets {
    public static void main(String ags[]) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());

            for(int i=0; i<T; i++) {
                int p = Integer.parseInt(br.readLine());
                int q = Integer.parseInt(br.readLine());
                int r = Integer.parseInt(br.readLine());

                int A[] = new int[p], B[] = new int[q], C[] = new int[r];

                String a[] = br.readLine().split(" ");
                String b[] = br.readLine().split(" ");
                String c[] = br.readLine().split(" ");

                for(int j=0; j<a.length; j++) {
                    A[j] = Integer.parseInt(a[j]);
                }

                for(int j=0; j<b.length; j++) {
                    B[j] = Integer.parseInt(b[j]);
                }

                for(int j=0; j<c.length; j++) {
                    C[j] = Integer.parseInt(c[j]);
                }
            }
        } catch (IOException ioe) {
            System.out.println("Unexpected eroor occurred.");
        }

    }
}
