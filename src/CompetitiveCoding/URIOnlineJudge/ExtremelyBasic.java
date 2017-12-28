package CompetitiveCoding.URIOnlineJudge;

import java.io.*;

public class ExtremelyBasic {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            int X = A + B;

            System.out.println("X = "+ X);
        } catch (IOException ioe) {
            System.out.println("Unexpected error occurred.");
        }
    }
}
