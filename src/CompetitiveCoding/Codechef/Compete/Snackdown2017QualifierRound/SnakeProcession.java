package CompetitiveCoding.Codechef.Compete.Snackdown2017QualifierRound;

import java.io.*;

class SnakeProcession{
    public static void main(String args[]) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int R = Integer.parseInt(br.readLine());
            for(int i=0; i<R; i++) {
                boolean valid=true;
                int L = Integer.parseInt(br.readLine()), hCount=0, tCount=0;
                String input = br.readLine();

                loop:
                for(int j=0; j<L; j++) {
                    switch(input.charAt(j)) {
                        case 'H':
                            if(tCount==hCount) {
                                hCount++;
                                break;
                            } else {
                                valid=false;
                                break loop;
                            }
                        case 'T':
                            if(tCount==hCount-1) {
                                tCount++;
                                break;
                            } else {
                                valid=false;
                                break loop;
                            }
                    }
                }

                if(valid && hCount!=tCount) {
                    valid=false;
                }


                if(valid) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }

            }
        } catch (IOException ioe) {
            System.out.println("Unexpected IO error occurred.");
        }
    }
}