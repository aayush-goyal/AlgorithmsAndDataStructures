package SearchingAndSorting.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt(), A[]=new int[length], key;
        
        System.out.println("Enter the elements of the array.");
        
        for(int i=0; i<A.length; i++) {
            A[i]=scanner.nextInt();
        }
        
        for(int i=1; i<A.length; i++) {
            // Assigning the key to the element of array currently being processed by the loop.
            key=A[i];
            // Insert A[j] into the sorted sequence A[0].....A[i-1]
            // Initializing loop counter for comparing key with every element of the sorted
            // array, A[0].....A[i-1]
            int j=i-1;
            /*
            Here is how the algorithm works.
            We start with one element previous to the key. If it is greater than the key than we shift it one
            position forward and the process continues. But if we encounter any element (e.g.: 'small') that is
            small than the key, we stop the process of inner loop that shifts the elements by one position and we
            insert the key one position ahead of this current element i.e. 'small'.
            */
            while(j>=0 && A[j]>key) {
                A[j+1]=A[j];
                j=j-1;
            }
            A[j+1]=key;
        }
        
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }        

    }
}