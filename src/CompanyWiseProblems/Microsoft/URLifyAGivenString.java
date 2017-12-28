package CompanyWiseProblems.Microsoft;

import java.io.*;

public class URLifyAGivenString {
    public static void main(String[] args) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            for(int i=0; i<t; i++) {
                String testCase = br.readLine(), URLify = "";
                int n = Integer.parseInt(br.readLine());
                testCase = testCase.trim();
                for(int j=0; j<testCase.length(); j++) {
                    if(testCase.charAt(j) == ' ') {
                        testCase = testCase.replace(Character.toString(testCase.charAt(j)), "%20");
                    }
                }
                System.out.println(testCase);
            }
        } catch (IOException ioe) {
            System.out.println("Unexpected error occurred.");
        }
    }
}