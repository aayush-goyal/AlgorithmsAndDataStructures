package Arrays;

import java.io.*;
import java.util.Hashtable;

public class FindTheNumberOccurringOddNumberOfTimes {
    public static void main(String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] array = br.readLine().split(" ");
            int[] A = new int[array.length];

            for (int i = 0; i < A.length; i++) {
                A[i] = Integer.parseInt(array[i]);
            }

            System.out.println(findNumberOccurringOddNumberOfTimesByBruteForce(A));
            findNumberOccurringOddNumberOfTimesByHashMap(A);
            System.out.println(findNumberOccurringOddNumberOfTimesByXOR(A));
        } catch (IOException ioe) {
            System.out.println("Unexpected error");
        }
    }

    private static int findNumberOccurringOddNumberOfTimesByBruteForce(int[] A) {
        int[] occurrences = new int[findMax(A)];
        for(int i : A) {
            occurrences[i-1]++;
        }

        for(int i=0; i<occurrences.length; i++) {
            if(occurrences[i]%2 != 0) {
                return i+1;
            }
        }

        return -1;
    }

    private static void findNumberOccurringOddNumberOfTimesByHashMap(int[] A) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        int occurrences;

        for(int i : A) {
            if(table.containsKey(i)) {
                occurrences = table.get(i);
                table.replace(i, ++occurrences);
            } else
                table.put(i, 1);
        }

        table.forEach((key, value) -> {
            if(value%2 != 0)
                System.out.println(key);
        });
    }

    private static int findNumberOccurringOddNumberOfTimesByXOR(int[] A) {
        int XOR = 0;
        for(int i : A) {
            XOR ^= i;
        }

        return XOR;
    }

    private static int findMax(int[] array) {
        int max = 0;
        for(int i : array) {
            if(i > max)
                max = i;
        }

        return max;
    }
}