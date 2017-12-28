package SearchingAndSorting.Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the array.");
        int length = scanner.nextInt();
        int A[] = new int[length];
        
        System.out.println("Enter the elements of the array.");
        
        for(int i=0; i<A.length; i++) {
            A[i] = scanner.nextInt();
        }

        mergeSort(A, 0, A.length-1);

        for(int i : A) {
            System.out.print(i + " ");
        }
    }
    
    // The basic merge sort algorithm.
    private static void mergeSort(int[] A, int start, int end) {
        if(start < end) {
            int middle = (start + end)/2;
            mergeSort(A, start, middle);
            mergeSort(A, middle+1, end);
            merge(A, start, middle, end);
        }
    }
    
    // This is a merge procedure that merges two sorted sub-array into one complete sorted array.
    private static void merge(int A[], int start, int middle, int end) {
        int n1 =middle-start+1, n2 = end-middle, L[] = new int[n1+1], R[] = new int[n2+1], i, j;
        for (i=0; i<n1; i++) {
            L[i]=A[start+i];
        }
        for(j=0; j<n2; j++) {
            R[j]=A[middle+1+j];
        }
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        i=0; j=0;
        for(int k=start; k<=end; k++) {
            if(L[i]<=R[j]) {
                A[k]=L[i];
                i=i+1;
            } else {
                A[k]=R[j];
                j=j+1;
            }
        }
    }
}