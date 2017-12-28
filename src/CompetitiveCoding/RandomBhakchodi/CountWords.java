package CompetitiveCoding.RandomBhakchodi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountWords {
    public static void main(String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String arr[] = br.readLine().split(" ");
            System.out.println(arr.length);
        } catch (IOException ioe) {
            System.out.println();
        }

    }
}
