package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class BearAndMilkyCookies {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            String result="YES";
            int items=scanner.nextInt();
            String arr[]=new String[items];
            
            for(int j=0; j<items; j++){
                arr[j]=scanner.next();
            }
            
            if(arr[items-1].equals("cookie")) {
                System.out.println("NO");
                continue;
            }
            
            for(int j=0; j<items-1; j++){
                if(arr[j].equals("cookie") && arr[j+1].equals("cookie")) {
                    result="NO";
                    break;
                } else {
                    result="YES";
                }
            }
            
            System.out.println(result);
            
        }
    }   
}