package CompetitiveCoding.Codechef.Beginner;

import java.util.Scanner;

class BeautifulArrays {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int noe=scanner.nextInt();
            boolean beautiful=true;
            int array[]=new int[noe];
            
            for(int j=0; j<noe; j++) {
                array[j]=scanner.nextInt();
            }
            
            for(int j=0; j<noe; j++) {
                for(int k=0; k<noe-1; k++) {
                    if(j==k) {
                        continue;
                    }
                    if(!matchAnElement(array, array[k]*array[k+1])) {
                        beautiful=false;
                        break;
                    }
                }
            }
            
            if(beautiful) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
    
    static boolean matchAnElement(int arr[], int num) {
        for(int i=0; i<arr.length; i++) {
            if(num==arr[i]) {
                return true;
            }
        }
        
        return false;
    }
}