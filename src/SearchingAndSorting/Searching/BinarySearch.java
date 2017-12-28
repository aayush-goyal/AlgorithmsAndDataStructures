package SearchingAndSorting.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the array.");
        int len=scanner.nextInt();
        int array[]=new int[len];
        System.out.println("Please enter " + len + " numbers to fill the array.");
        for(int i=0; i<len; i++) {
            array[i]=scanner.nextInt();
        }
        System.out.println("Please enter the number to search.");
        int number=scanner.nextInt();

        int loc=binarySearch(array, number);

        if(loc==-1) {
            System.out.println("Sorry! Your number is not in the array.");
        } else {
            System.out.println("Your number is at " + (loc+1) + " position in the array.");
        }

    }

    static public int binarySearch(int array[], int number) {
        int beg = 0, end = array.length-1, mid = (beg+end)/2;
        while(beg<=end) {
            if(number<array[mid]) {
                end = mid-1;
                mid = (beg+end)/2;
            } else if(number>array[mid]) {
                beg = mid+1;
                mid = (beg+end)/2;
            } else {
                return mid;
            }
        }

        return -1;
    }
}