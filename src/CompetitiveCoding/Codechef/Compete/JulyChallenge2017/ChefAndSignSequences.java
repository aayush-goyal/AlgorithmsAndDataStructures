package CompetitiveCoding.Codechef.Compete.JulyChallenge2017;

import java.io.*;

public class ChefAndSignSequences {
    public static void main(String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());

            for(int i = 0; i<T; i++) {
                String[] signs = br.readLine().split(" ");
                int current = 1, P = current;
                for(String s : signs) {
                    /* switch(s) {
                        case ">":

                            break;
                        case "<":
                            current
                            break;
                        case "=":
                            break;
                    } */
                }
                System.out.println(P);
            }
        } catch (IOException ioe) {
            System.out.println("Unexpected error occerred.");
        }
    }
}
