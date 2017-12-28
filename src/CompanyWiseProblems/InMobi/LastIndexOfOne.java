package CompanyWiseProblems.InMobi;

import java.util.Scanner;

class LastIndexOfOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i<t; i++) {
            String testCase = scanner.next();
            int position = 0;
            for(int j = testCase.length()-1; j>=0; j--) {
                if(testCase.charAt(j) == '1') {
                    position = j;
                    break;
                }
            }
            System.out.println(position);
        }
    }
}