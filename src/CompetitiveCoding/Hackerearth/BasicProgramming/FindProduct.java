package CompetitiveCoding.Hackerearth.BasicProgramming;

import java.io.*;

class FindProduct {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            long array[] = new long[N], answer = 1, m = 1000000007;
            String[] arrayS = br.readLine().split(" ");

            for(int i=0; i<N; i++)
                array[i] = Long.parseLong(arrayS[i]);

            for(long i : array) {
                answer *= i;
                answer %= m;
            }

            System.out.println(answer);
        } catch(IOException ioe) {
            System.out.println("Unexpected error occurred.");
        }
    }
}