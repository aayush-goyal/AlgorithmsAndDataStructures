package CompanyWiseProblems.Amazon;

import java.io.*;

public class NumbersWithSameFirstAndLastDigit {
    public static void main(String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());

            for(int i=0; i<T; i++) {
                String LR[] = br.readLine().split(" ");
                int L = Integer.parseInt(LR[0]);
                int R = Integer.parseInt(LR[1]);
                int count = 0;

                for(int j=L; j<R+1; j++) {
                    String number = Integer.toString(j);
                    if(number.charAt(0) == number.charAt(number.length()-1)) {
                        count++;
                    }
                }

                System.out.println(count);
            }
        } catch(IOException ioe) {
            System.out.println("Unexpected error occurred.");
        }
    }
}