package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class SecondLargest {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            if(a>b) {
                if(a>c) {
                    if(b>c) {
                        System.out.println(b);
                    } else {
                        System.out.println(c);
                    }
                } else {
                    System.out.println(a);
                }
            } else {
                if(b>c) {
                    if(a>c) {
                        System.out.println(a);
                    } else {
                        System.out.println(c);
                    }
                } else {
                    System.out.println(b);
                }
            }
        }
    }
}