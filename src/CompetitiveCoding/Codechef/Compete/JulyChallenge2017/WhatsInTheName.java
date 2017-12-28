package CompetitiveCoding.Codechef.Compete.JulyChallenge2017;

import java.io.*;

class WhatsInTheName {
    public static void main(String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());

            for(int i = 0; i < T; i++) {
                String nameArr[] = br.readLine().split(" ");
                switch(nameArr.length) {
                    case 1:
                        System.out.println(Character.toUpperCase(nameArr[0].charAt(0)) + nameArr[0].substring(1, nameArr[0].length()));
                        break;
                    case 2:
                        System.out.println(Character.toUpperCase(nameArr[0].charAt(0)) + "." + " " +
                                Character.toUpperCase(nameArr[1].charAt(0)) + nameArr[1].substring(1, nameArr[1].length()).toLowerCase());
                        break;
                    case 3:
                        System.out.println(Character.toUpperCase(nameArr[0].charAt(0)) + "." + " " +
                                Character.toUpperCase(nameArr[1].charAt(0)) + "." + " " +
                                Character.toUpperCase(nameArr[2].charAt(0)) + nameArr[2].substring(1, nameArr[2].length()).toLowerCase());
                        break;
                }
            }
        } catch (IOException ioe) {
            System.out.println("Unexpected error occurred.");
        }

    }
}