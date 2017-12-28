package CompetitiveCoding.Codechef.Compete.MayLoCCompetitiveProgrammingMarathon;

import java.io.*;
import java.lang.Math;

public class BondAndFond {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            long num = Long.parseLong(br.readLine());
            System.out.println(findNearestPower(num));
        }
    }

    static long findNearestPower(long num) {
        int counter=0;
        long temp=num;
        while(temp>0) {
            temp/=2;
            counter++;
        }
        int power = counter+1;

        if((Math.pow(2, power)-num)<=(Math.pow(2, power+1)-num)) {
            return (long) Math.abs(Math.pow(2, power)-num);
        } else {
            return (long) Math.abs(Math.pow(2, power+1)-num);
        }
    }
}
