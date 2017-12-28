package CompanyWiseProblems.Infosys;

import java.io.*;

public class ReverseAnArray {
    public static void main (String args[]) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());

            for(int j=0; j<T; j++) {
                int N = Integer.parseInt(br.readLine());
                int array[] = new int[N];
                String A[] = br.readLine().split(" ");
                for(int i=0; i<N; i++) {
                    array[i] = Integer.parseInt(A[i]);
                }

                for(int i=N-1; i>=0; i--) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }
        } catch (IOException ioe) {
            System.out.println("Unexpected Error occurred.");
        }
    }
}