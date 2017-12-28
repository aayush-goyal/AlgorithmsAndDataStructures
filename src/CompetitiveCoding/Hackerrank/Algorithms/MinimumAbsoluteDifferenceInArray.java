package CompetitiveCoding.Hackerrank.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

class MinimumAbsoluteDifferenceInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int min = Math.abs(a[1]-a[0]);
        
        for(int i = 1; i<a.length-1; i++) {
            min = Math.min(Math.abs(a[i+1]-a[i]), min);
        }
        
        System.out.println(min);
    }
}