package CompetitiveCoding.Spoj.Basics;

import java.util.Scanner;

class Wow {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        StringBuilder string = new StringBuilder("W");
        for(int i=0; i<x; i++) {
            string.append("o");
        }
        string.append("w");
        System.out.println(string);
    }
}