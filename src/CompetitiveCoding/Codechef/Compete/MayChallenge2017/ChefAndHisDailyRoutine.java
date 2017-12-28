package CompetitiveCoding.Codechef.Compete.MayChallenge2017;

import java.io.*;
import java.util.regex.Pattern;

class ChefAndHisDailyRoutine {
    public static void main(String args[]) throws IOException{
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
            int N=Integer.parseInt(br.readLine());

            for(int i=0; i<N; i++) {
                String tasks=br.readLine();
                boolean isCorrect=Pattern.matches("C*E*S*", tasks);

                if(isCorrect) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        } catch (IOException ioe) {
           System.out.println("Unexpected IO error occurred."); 
        }
    }
}