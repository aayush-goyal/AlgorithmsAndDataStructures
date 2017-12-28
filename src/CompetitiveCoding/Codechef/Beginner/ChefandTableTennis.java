package CompetitiveCoding.Codechef.Beginner;

import java.io.*;

class ChefandTableTennis {
    public static void main(String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());

            for(int i=0; i<T; i++) {
                int chefWon = 0, chefConceded = 0;
                String scores = br.readLine();
                for(int j=0; j<scores.length(); j++) {
                    switch (scores.charAt(j)) {
                        case '1':
                            chefWon++;
                            break;
                        case '0':
                            chefConceded++;
                            break;
                    }

                    if(chefWon == 11 && chefConceded < 10) {
                        System.out.println("WIN");
                        break;
                    } else if(chefConceded == 11 && chefWon < 10) {
                        System.out.println("LOSE");
                        break;
                    } else {
                        if(chefWon > 9 && chefConceded > 9) {
                            if(chefWon - chefConceded == 2) {
                                System.out.println("WIN");
                                break;
                            } else if(chefConceded - chefWon == 2) {
                                System.out.println("LOSE");
                                break;
                            }
                        }
                    }
                }
            }
        } catch (IOException ioe) {
            System.out.println("Unexpected error occurred.");
        }
    }
}