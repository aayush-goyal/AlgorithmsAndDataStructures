package SearchingAndSorting.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int length = scanner.nextInt();
        int array[]=new int[length];
        for(int i=0; i<length; i++) {
           array[i]=scanner.nextInt();
        }
        
        for(int i=0; i<array.length-1; i++) {
            for(int j=0; j<length-i-1; j++) {
                if(array[j]>array[j+1]) {
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        
        for(int i: array) {
            System.out.print(i + " ");
        }
        
    }
}