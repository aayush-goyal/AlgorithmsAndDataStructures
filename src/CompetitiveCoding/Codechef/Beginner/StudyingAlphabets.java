package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class StudyingAlphabets {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        String known=scanner.next();
        String k[]=new String[known.length()];
        for(int i=0; i<known.length(); i++) {
            k[i]=Character.toString(known.charAt(i));
        }
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            String word=scanner.next();
            for(int j=0; j<word.length(); j++) {
                for(String jk:k) {
                    if(Character.toString(word.charAt(j)).equals(jk)) {
                        break;
                    }
                }
            }
            System.out.println("YES");
        }
    }
}
