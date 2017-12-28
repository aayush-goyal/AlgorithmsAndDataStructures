package CompetitiveCoding.RandomBhakchodi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NC0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for(int i=0; i<q; i++) {
            String word = scanner.next();
            boolean firstOne = false;
            int count = 0;
            Pattern pattern = Pattern.compile("10+1");
            Matcher matcher = pattern.matcher(word);

            while (matcher.find()) {
                count++;
            }

            System.out.println(count);
        }
    }
}