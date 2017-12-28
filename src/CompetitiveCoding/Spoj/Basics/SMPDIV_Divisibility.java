package CompetitiveCoding.Spoj.Basics;

import java.io.*;

class SMPDIV_Divisibility {
    public static void main (String args[]) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            for(int i=0; i<t; i++) {
                String nxy[] = br.readLine().split(" ");
                int n = Integer.parseInt(nxy[0]);
                int x = Integer.parseInt(nxy[1]);
                int y = Integer.parseInt(nxy[2]);

                for(int j=2; j<n; j++) {
                    if(j%x == 0 && j%y !=0) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        } catch (IOException ioe) {
            System.out.println("Unexpected error occurred.");
        }
    }
}