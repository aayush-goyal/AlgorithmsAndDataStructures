package CompetitiveCoding.Hackerearth.BasicProgramming;

import java.util.*;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().toCharArray()[0];
        if("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c) != -1)
            System.out.println(c-'A' + 65);
        else
            System.out.println(c-'a' + 97);
    }
}
