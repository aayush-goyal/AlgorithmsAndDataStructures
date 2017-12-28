package SearchingAndSorting.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        int array[]=new int[len];
        int loc=-1;
        System.out.println("Please enter " + len + " numbers to fill the array.");
        for(int i=0; i<len; i++) {
            array[i]=scanner.nextInt();
        }
        System.out.println("Please enter the number to search.");
        int num=scanner.nextInt();
        
        for(int i=0; i<array.length; i++) {
            if(array[i]==num) {
                loc=i+1;
                break;
            }
        }
        
        if(loc==-1) {
            System.out.println("Sorry! Your number is not in the array.");
        } else {
            System.out.println("Your number is at " + loc + "th position in the array.");
        }
        
    }
}