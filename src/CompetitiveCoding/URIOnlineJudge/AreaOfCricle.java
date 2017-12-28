package CompetitiveCoding.URIOnlineJudge;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class AreaOfCricle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble(), pi = 3.14159;

        double A = pi * R * R;
        DecimalFormat df = new DecimalFormat("#.####");
        A = Double.parseDouble(df.format(A));
        Formatter fmt = new Formatter();
        fmt.format("%.4f", A);
        System.out.println("A=" + fmt);
    }
}