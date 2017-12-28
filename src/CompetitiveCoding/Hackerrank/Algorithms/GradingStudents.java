package CompetitiveCoding.Hackerrank.Algorithms;

import java.util.Scanner;

public class GradingStudents {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; i++) {
            int marks = scanner.nextInt();
            System.out.println(gradeStudents(marks));
        }
    }

    private static int gradeStudents(int n) {
        if(n<38) {
            return n;
        } else if((((n/5)+1)*5)-(n)<3) {
            return n+(((n/5)+1)*5)-(n);
        } else {
            return n;
        }
    }
}